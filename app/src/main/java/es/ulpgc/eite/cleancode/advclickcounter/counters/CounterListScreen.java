package es.ulpgc.eite.cleancode.advclickcounter.counters;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class CounterListScreen {

  public static void configure(CounterListContract.View view) {

    AppMediator mediator = AppMediator.getInstance();

    CounterListContract.Presenter presenter = new CounterListPresenter(mediator);
    CounterListContract.Model model = new CounterListModel();
    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
