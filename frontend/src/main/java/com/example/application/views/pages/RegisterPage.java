package com.example.application.views.pages;

import com.example.application.views.components.RegisterForm;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

@Route("register")
@CssImport("./themes/styles.css")
public class RegisterPage extends HorizontalLayout {

    RegisterForm registerForm = new RegisterForm();

    public RegisterPage () {

        HorizontalLayout mainLayout = new HorizontalLayout();
        mainLayout.addClassName("main-layout");

        Div leftCol = new Div();
        leftCol.addClassName("left-col");
        leftCol.add(registerForm);

        Div rightCol = new Div();
        rightCol.addClassName("right-col");
        rightCol.add(RegisterImage());

        mainLayout.add(leftCol, rightCol);

        add(mainLayout);
    }

    public Component RegisterImage () {
        StreamResource imageResource = new StreamResource("register-image.png",
                () -> getClass().getResourceAsStream("/assets/images/register-image.png"));

        Image image = new Image(imageResource, "image");
        image.addClassName("register-image");

        return image;
    }
}
