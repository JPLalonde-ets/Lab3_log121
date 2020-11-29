package controller;

import model.Perspective;

public abstract class Command {
    abstract Perspective execute();
    abstract void undo();
}
