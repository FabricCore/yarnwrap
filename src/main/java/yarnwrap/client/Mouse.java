package yarnwrap.client;
public class Mouse { public net.minecraft.client.Mouse wrapperContained; public Mouse(net.minecraft.client.Mouse wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public int activeButton() { return wrapperContained.activeButton; }
// public void activeButton(int value) { wrapperContained.activeButton = value; }
// public int controlLeftClicks() { return wrapperContained.controlLeftClicks; }
// public void controlLeftClicks(int value) { wrapperContained.controlLeftClicks = value; }
// public yarnwrap.util.math.Smoother cursorYSmoother() { return new yarnwrap.util.math.Smoother(wrapperContained.cursorYSmoother); }
// public void cursorYSmoother(yarnwrap.util.math.Smoother value) { wrapperContained.cursorYSmoother = value.wrapperContained; }
// public boolean cursorLocked() { return wrapperContained.cursorLocked; }
// public void cursorLocked(boolean value) { wrapperContained.cursorLocked = value; }
// public boolean hasResolutionChanged() { return wrapperContained.hasResolutionChanged; }
// public void hasResolutionChanged(boolean value) { wrapperContained.hasResolutionChanged = value; }
// public double cursorDeltaY() { return wrapperContained.cursorDeltaY; }
// public void cursorDeltaY(double value) { wrapperContained.cursorDeltaY = value; }
// public boolean rightButtonClicked() { return wrapperContained.rightButtonClicked; }
// public void rightButtonClicked(boolean value) { wrapperContained.rightButtonClicked = value; }
// public double cursorDeltaX() { return wrapperContained.cursorDeltaX; }
// public void cursorDeltaX(double value) { wrapperContained.cursorDeltaX = value; }
// public boolean middleButtonClicked() { return wrapperContained.middleButtonClicked; }
// public void middleButtonClicked(boolean value) { wrapperContained.middleButtonClicked = value; }
// public boolean leftButtonClicked() { return wrapperContained.leftButtonClicked; }
// public void leftButtonClicked(boolean value) { wrapperContained.leftButtonClicked = value; }
// public double glfwTime() { return wrapperContained.glfwTime; }
// public void glfwTime(double value) { wrapperContained.glfwTime = value; }
// public yarnwrap.util.math.Smoother cursorXSmoother() { return new yarnwrap.util.math.Smoother(wrapperContained.cursorXSmoother); }
// public void cursorXSmoother(yarnwrap.util.math.Smoother value) { wrapperContained.cursorXSmoother = value.wrapperContained; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public double eventDeltaHorizontalWheel() { return wrapperContained.eventDeltaHorizontalWheel; }
// public void eventDeltaHorizontalWheel(double value) { wrapperContained.eventDeltaHorizontalWheel = value; }
// public double eventDeltaVerticalWheel() { return wrapperContained.eventDeltaVerticalWheel; }
// public void eventDeltaVerticalWheel(double value) { wrapperContained.eventDeltaVerticalWheel = value; }
// public double lastTickTime() { return wrapperContained.lastTickTime; }
// public void lastTickTime(double value) { wrapperContained.lastTickTime = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
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