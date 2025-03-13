package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterListModel implements CounterListContract.Model {

  public static String TAG = "AdvClickCounter.CounterListModel";

  private List<CounterData> counters;

  public CounterListModel() {
    counters = new ArrayList<>();
  }


  @Override
  public List<CounterData> getStoredCounterList() {
    // Log.e(TAG, "getStoredCounterList()");
    return counters;
  }

  @Override
  public void onRestartScreen(List<CounterData> counters) {
    // Log.e(TAG, "onRestartScreen()");

    // TODO: include code if necessary
  }

  @Override
  public void onAddCounter(CounterData counter) {

    // TODO: include code if necessary
  }

  @Override
  public void onDataFromNextScreen(CounterData counter) {
    // Log.e(TAG, "onDataFromNextScreen()");

    // TODO: include code if necessary
  }

}
