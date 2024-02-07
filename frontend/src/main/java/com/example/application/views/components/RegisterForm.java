package com.example.application.views.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.RouterLink;

@CssImport("./themes/styles.css")
public class RegisterForm extends VerticalLayout {

    TextField name = new TextField("Name");
    EmailField email = new EmailField("Email");
    PasswordField passwordField = new PasswordField("Password");
    Button button = new Button("Sign up");

    VerticalLayout form = new VerticalLayout();

    public RegisterForm () {
        addClassName("register-form");

        H2 title = new H2("Create your free account");
        title.addClassName("title");

        name.setPlaceholder("Type your name");
        name.addClassName("text-field");

        email.setPlaceholder("Type your email");
        email.addClassName("text-field");

        passwordField.setPlaceholder("Type your password");
        passwordField.addClassName("text-field");

        button.addClassName("register-button");

        HorizontalLayout footerText = new HorizontalLayout();
        footerText.addClassName("footer-text");
        Span alreadyHaveAnAccount = new Span("Already have an account?");
//        RouterLink route = new RouterLink("login", LoginForm.class);
        Anchor signIn = new Anchor("/login", "Sign in");
//        Span signIn = new Span("Sign in");

        footerText.add(alreadyHaveAnAccount, signIn);
        footerText.setAlignItems(Alignment.CENTER);

        form.add(title, name, email, passwordField, button, footerText);

        add(form);
    }
}
