package com.example.application.views.Hello;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("bless")
public class HeyBless extends HorizontalLayout {
    public HeyBless(){
        add(new H4("Hello From Bless's View "));
    }
}
