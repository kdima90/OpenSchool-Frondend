package kdima90.views.home;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import kdima90.views.MainLayout;

@PageTitle("Home")
@Route(value = "home", layout = MainLayout.class)
public class Home extends VerticalLayout {

    public Home() {
    }

}
