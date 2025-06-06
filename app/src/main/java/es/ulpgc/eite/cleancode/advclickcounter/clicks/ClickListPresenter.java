package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;
import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;

public class ClickListPresenter implements ClickListContract.Presenter {

  public static String TAG = "AdvClickCounter.ClickListPresenter";

  private WeakReference<ClickListContract.View> view;
  private ClickListState state;
  private ClickListContract.Model model;
  private AppMediator mediator;

  public ClickListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    //state = mediator.getClickListState();
  }


  @Override
  public void onCreateCalled() {
    Log.e(TAG, "onCreateCalled()");

    // initialize the state
    state = new ClickListState();
    // TODO: include code if necessary

    // use passed state
    CounterToClickState savedState = getStateFromPreviousScreen();
    if (savedState != null) {

      // update the model
      // TODO: include code if necessary
    }
  }

  @Override
  public void onRecreateCalled() {
    Log.e(TAG, "onRecreateCalled()");

    // get back the state
    state = mediator.getClickListState();

    // update the model
    // TODO: include code if necessary
  }

  @Override
  public void onResumeCalled() {
    Log.e(TAG, "onResumeCalled()");

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
    mediator.setClickListState(state);
  }

  @Override
  public void onDestroyCalled() {
    Log.e(TAG, "onDestroyCalled()");
  }


  @Override
  public void onClickListPressed(ClickData click) {
    // Log.e(TAG, "onClickListPressed()");

    // TODO: include code if necessary
  }

  @Override
  public void onClickButtonPressed() {
    // Log.e(TAG, "onClickButtonPressed()");

    // TODO: include code if necessary
  }

  private void passStateToPreviousScreen(ClickToCounterState state) {
    mediator.setPreviousDetailScreenState(state);
  }

  private CounterToClickState getStateFromPreviousScreen() {
    return mediator.getPreviousDetailScreenState();
  }


  @Override
  public void injectView(WeakReference<ClickListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ClickListContract.Model model) {
    this.model = model;
  }


}
