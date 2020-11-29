package controller;

import model.MementoPerspective;
import model.Perspective;

import java.util.ArrayList;
import java.util.Stack;

public class GestionnaireCommande {

    private static GestionnaireCommande uniqueInstance = new GestionnaireCommande();
    private static Stack<Perspective> commandStack = new Stack<>();

    /*
    TODO: we gotta add a link to the momentoperspective
     */

    void zoomExecute(){
//        commandStack.push(new Zoom());
    }
    void zoomUndo(){
        if(!commandStack.empty())
        commandStack.pop();
    }
    void translateExecute(){

    }
    void translateUndo(){
        if(!commandStack.empty())
            commandStack.pop();
    }



    public static GestionnaireCommande getInstance() {
        return uniqueInstance;
    }

}
