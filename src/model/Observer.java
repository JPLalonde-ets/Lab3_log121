package view;

import model.Perspective;

public interface Observer {
    void update(String path, Perspective perspective);
}
