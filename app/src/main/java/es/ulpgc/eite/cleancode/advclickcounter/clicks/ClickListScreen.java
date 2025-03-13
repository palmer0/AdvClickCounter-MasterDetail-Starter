package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class ClickListScreen {

  public static void configure(ClickListContract.View view) {

    AppMediator mediator = AppMediator.getInstance();

    ClickListContract.Presenter presenter = new ClickListPresenter(mediator);
    ClickListContract.Model model = new ClickListModel();
    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
