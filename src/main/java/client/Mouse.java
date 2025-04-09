package yarnwrap.client;
public class Mouse { public net.minecraft.client.Mouse wrapperContained; public Mouse(net.minecraft.client.Mouse wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public int activeButton() { return wrapperContained.activeButton; }
// public int controlLeftClicks() { return wrapperContained.controlLeftClicks; }
// public yarnwrap.util.math.Smoother cursorYSmoother() { return new yarnwrap.util.math.Smoother(wrapperContained.cursorYSmoother); }
// public boolean cursorLocked() { return wrapperContained.cursorLocked; }
// public boolean hasResolutionChanged() { return wrapperContained.hasResolutionChanged; }
// public double cursorDeltaY() { return wrapperContained.cursorDeltaY; }
// public boolean rightButtonClicked() { return wrapperContained.rightButtonClicked; }
// public double cursorDeltaX() { return wrapperContained.cursorDeltaX; }
// public boolean middleButtonClicked() { return wrapperContained.middleButtonClicked; }
// public boolean leftButtonClicked() { return wrapperContained.leftButtonClicked; }
// public double glfwTime() { return wrapperContained.glfwTime; }
// public yarnwrap.util.math.Smoother cursorXSmoother() { return new yarnwrap.util.math.Smoother(wrapperContained.cursorXSmoother); }
// public double y() { return wrapperContained.y; }
// public double x() { return wrapperContained.x; }
// public double eventDeltaHorizontalWheel() { return wrapperContained.eventDeltaHorizontalWheel; }
// public double eventDeltaVerticalWheel() { return wrapperContained.eventDeltaVerticalWheel; }
// public double lastTickTime() { return wrapperContained.lastTickTime; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void onMouseScroll(long window,double horizontal,double vertical) { wrapperContained.onMouseScroll(window,horizontal,vertical); }
public void onResolutionChanged() { wrapperContained.onResolutionChanged(); }
// public void onCursorPos(long window,double x,double y) { wrapperContained.onCursorPos(window,x,y); }
// public void onMouseButton(long window,int button,int action,int mods) { wrapperContained.onMouseButton(window,button,action,mods); }
public double getX() { return wrapperContained.getX(); }
public double getY() { return wrapperContained.getY(); }
// public void updateMouse(double timeDelta) { wrapperContained.updateMouse(timeDelta); }
public void setup(long window) { wrapperContained.setup(window); }
public boolean wasLeftButtonClicked() { return wrapperContained.wasLeftButtonClicked(); }
public boolean wasRightButtonClicked() { return wrapperContained.wasRightButtonClicked(); }
public void unlockCursor() { wrapperContained.unlockCursor(); }
public void lockCursor() { wrapperContained.lockCursor(); }
public boolean isCursorLocked() { return wrapperContained.isCursorLocked(); }
// public void onFilesDropped(long window,java.util.List paths,int invalidFilesCount) { wrapperContained.onFilesDropped(window,paths,invalidFilesCount); }
public void setResolutionChanged() { wrapperContained.setResolutionChanged(); }
public boolean wasMiddleButtonClicked() { return wrapperContained.wasMiddleButtonClicked(); }
public void tick() { wrapperContained.tick(); }

}