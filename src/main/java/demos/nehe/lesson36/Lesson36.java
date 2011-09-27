package demos.nehe.lesson36;

import demos.common.GLDisplay;
import demos.common.LessonNativeLoader;

/**
 * @author Pepijn Van Eeckhoudt
 */
public class Lesson36 extends LessonNativeLoader{
    public static void main(String[] args) {
        GLDisplay neheGLDisplay = GLDisplay.createGLDisplay("Lesson 36: Radial blur");
        Renderer renderer = new Renderer();
        neheGLDisplay.addGLEventListener(renderer);
        neheGLDisplay.start();
    }
}
