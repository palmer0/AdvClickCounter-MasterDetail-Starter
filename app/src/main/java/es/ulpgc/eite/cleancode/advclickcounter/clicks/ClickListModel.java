package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.util.ArrayList;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class ClickListModel implements ClickListContract.Model {

  public static String TAG = "AdvClickCounter.ClickListModel";

  public CounterData counter;

  /*
  public ClickListModel() {
    counter = new CounterData();
    counter.clicks = new ArrayList<>();
  }
  */

  @Override
  public CounterData getStoredData() {
    // Log.e(TAG, "getStoredCounterList()");
    return counter;
  }

  @Override
  public void onRestartScreen(CounterData counter) {
    // Log.e(TAG, "onRestartScreen()");

    // TODO: include code if necessary
  }


  @Override
  public void onDataFromPreviousScreen(CounterData counter) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
    this.counter=counter;
  }

  @Override
  public void onAddClick(ClickData click) {

    // TODO: include code if necessary
  }

  @Override
  public void onUpdateClick(ClickData click) {

    // TODO: include code if necessary
  }
}
