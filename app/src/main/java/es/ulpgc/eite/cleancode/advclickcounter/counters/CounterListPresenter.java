package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class CounterListPresenter implements CounterListContract.Presenter {

  public static String TAG = "AdvClickCounter.CounterListPresenter";

  private WeakReference<CounterListContract.View> view;
  private CounterListState state;
  private CounterListContract.Model model;
  private AppMediator mediator;

  public CounterListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    //state = mediator.getCounterListState();
  }

  @Override
  public void onCreateCalled() {
    Log.e(TAG, "onCreateCalled()");

    // initialize the state
    state = new CounterListState();
    // TODO: include code if necessary

  }

  @Override
  public void onRecreateCalled() {
    Log.e(TAG, "onRecreateCalled()");

    // get back the state
    state = mediator.getCounterListState();

    // update the model
    // TODO: include code if necessary
  }

  @Override
  public void onResumeCalled() {
    Log.e(TAG, "onResumeCalled()");

    // use passed state
    ClickToCounterState savedState = getStateFromNextScreen();
    if (savedState != null) {

      // update the model
      // TODO: include code if necessary
    }

    // call the model and update the state
    // TODO: include code if necessary

    // update the view
    view.get().onDataUpdated(state);

  }

  @Override
  public void onBackPressedCalled() {
    Log.e(TAG, "onBackPressedCalled()");

    // TODO: include code if necessary
  }

  @Override
  public void onPauseCalled() {
    Log.e(TAG, "onPauseCalled()");

    // save the state
    mediator.setCounterListState(state);
  }

  @Override
  public void onDestroyCalled() {
    Log.e(TAG, "onDestroyCalled()");
  }

  @Override
  public void onListPressed(CounterData counter) {
    Log.e(TAG, "onClickListPressed()");

    // TODO: include code if necessary
  }


  @Override
  public void onCounterButtonPressed() {
    Log.e(TAG, "onCounterButtonPressed()");

    // TODO: include code if necessary
  }

  private void passStateToNextScreen(CounterToClickState state) {
    mediator.setNextMasterScreenState(state);
  }


  private ClickToCounterState getStateFromNextScreen() {
    return mediator.getNextMasterScreenState();
  }


  @Override
  public void injectView(WeakReference<CounterListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CounterListContract.Model model) {
    this.model = model;
  }

}
