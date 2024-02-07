package com.example.application.views.world;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("waga")
public class world extends VerticalLayout {

    public world () {
        add(new H1("Hello world from Waga's component"));
    }
}
