package yarnwrap.client;
public class Mouse { public net.minecraft.client.Mouse wrapperContained; public Mouse(net.minecraft.client.Mouse wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.Mouse.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.Mouse.client = value.wrapperContained; }

// public int activeButton() { return wrapperContained.activeButton; }
// public void activeButton(int value) { wrapperContained.activeButton = value; }
// public static int activeButton() { return net.minecraft.client.Mouse.activeButton; }
// public static void activeButton(int value, ) { net.minecraft.client.Mouse.activeButton = value; }

// public int controlLeftClicks() { return wrapperContained.controlLeftClicks; }
// public void controlLeftClicks(int value) { wrapperContained.controlLeftClicks = value; }
// public static int controlLeftClicks() { return net.minecraft.client.Mouse.controlLeftClicks; }
// public static void controlLeftClicks(int value, ) { net.minecraft.client.Mouse.controlLeftClicks = value; }

// public yarnwrap.util.math.Smoother cursorYSmoother() { return new yarnwrap.util.math.Smoother(wrapperContained.cursorYSmoother); }
// public void cursorYSmoother(yarnwrap.util.math.Smoother value) { wrapperContained.cursorYSmoother = value.wrapperContained; }
// public static yarnwrap.util.math.Smoother cursorYSmoother() { return new yarnwrap.util.math.Smoother(net.minecraft.client.Mouse.cursorYSmoother); }
// public static void cursorYSmoother(yarnwrap.util.math.Smoother value, ) { net.minecraft.client.Mouse.cursorYSmoother = value.wrapperContained; }

// public boolean cursorLocked() { return wrapperContained.cursorLocked; }
// public void cursorLocked(boolean value) { wrapperContained.cursorLocked = value; }
// public static boolean cursorLocked() { return net.minecraft.client.Mouse.cursorLocked; }
// public static void cursorLocked(boolean value, ) { net.minecraft.client.Mouse.cursorLocked = value; }

// public boolean hasResolutionChanged() { return wrapperContained.hasResolutionChanged; }
// public void hasResolutionChanged(boolean value) { wrapperContained.hasResolutionChanged = value; }
// public static boolean hasResolutionChanged() { return net.minecraft.client.Mouse.hasResolutionChanged; }
// public static void hasResolutionChanged(boolean value, ) { net.minecraft.client.Mouse.hasResolutionChanged = value; }

// public double cursorDeltaY() { return wrapperContained.cursorDeltaY; }
// public void cursorDeltaY(double value) { wrapperContained.cursorDeltaY = value; }
// public static double cursorDeltaY() { return net.minecraft.client.Mouse.cursorDeltaY; }
// public static void cursorDeltaY(double value, ) { net.minecraft.client.Mouse.cursorDeltaY = value; }

// public boolean rightButtonClicked() { return wrapperContained.rightButtonClicked; }
// public void rightButtonClicked(boolean value) { wrapperContained.rightButtonClicked = value; }
// public static boolean rightButtonClicked() { return net.minecraft.client.Mouse.rightButtonClicked; }
// public static void rightButtonClicked(boolean value, ) { net.minecraft.client.Mouse.rightButtonClicked = value; }

// public double cursorDeltaX() { return wrapperContained.cursorDeltaX; }
// public void cursorDeltaX(double value) { wrapperContained.cursorDeltaX = value; }
// public static double cursorDeltaX() { return net.minecraft.client.Mouse.cursorDeltaX; }
// public static void cursorDeltaX(double value, ) { net.minecraft.client.Mouse.cursorDeltaX = value; }

// public boolean middleButtonClicked() { return wrapperContained.middleButtonClicked; }
// public void middleButtonClicked(boolean value) { wrapperContained.middleButtonClicked = value; }
// public static boolean middleButtonClicked() { return net.minecraft.client.Mouse.middleButtonClicked; }
// public static void middleButtonClicked(boolean value, ) { net.minecraft.client.Mouse.middleButtonClicked = value; }

// public boolean leftButtonClicked() { return wrapperContained.leftButtonClicked; }
// public void leftButtonClicked(boolean value) { wrapperContained.leftButtonClicked = value; }
// public static boolean leftButtonClicked() { return net.minecraft.client.Mouse.leftButtonClicked; }
// public static void leftButtonClicked(boolean value, ) { net.minecraft.client.Mouse.leftButtonClicked = value; }

// public double glfwTime() { return wrapperContained.glfwTime; }
// public void glfwTime(double value) { wrapperContained.glfwTime = value; }
// public static double glfwTime() { return net.minecraft.client.Mouse.glfwTime; }
// public static void glfwTime(double value, ) { net.minecraft.client.Mouse.glfwTime = value; }

// public yarnwrap.util.math.Smoother cursorXSmoother() { return new yarnwrap.util.math.Smoother(wrapperContained.cursorXSmoother); }
// public void cursorXSmoother(yarnwrap.util.math.Smoother value) { wrapperContained.cursorXSmoother = value.wrapperContained; }
// public static yarnwrap.util.math.Smoother cursorXSmoother() { return new yarnwrap.util.math.Smoother(net.minecraft.client.Mouse.cursorXSmoother); }
// public static void cursorXSmoother(yarnwrap.util.math.Smoother value, ) { net.minecraft.client.Mouse.cursorXSmoother = value.wrapperContained; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.client.Mouse.y; }
// public static void y(double value, ) { net.minecraft.client.Mouse.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.client.Mouse.x; }
// public static void x(double value, ) { net.minecraft.client.Mouse.x = value; }

// public double eventDeltaHorizontalWheel() { return wrapperContained.eventDeltaHorizontalWheel; }
// public void eventDeltaHorizontalWheel(double value) { wrapperContained.eventDeltaHorizontalWheel = value; }
// public static double eventDeltaHorizontalWheel() { return net.minecraft.client.Mouse.eventDeltaHorizontalWheel; }
// public static void eventDeltaHorizontalWheel(double value, ) { net.minecraft.client.Mouse.eventDeltaHorizontalWheel = value; }

// public double eventDeltaVerticalWheel() { return wrapperContained.eventDeltaVerticalWheel; }
// public void eventDeltaVerticalWheel(double value) { wrapperContained.eventDeltaVerticalWheel = value; }
// public static double eventDeltaVerticalWheel() { return net.minecraft.client.Mouse.eventDeltaVerticalWheel; }
// public static void eventDeltaVerticalWheel(double value, ) { net.minecraft.client.Mouse.eventDeltaVerticalWheel = value; }

// public double lastTickTime() { return wrapperContained.lastTickTime; }
// public void lastTickTime(double value) { wrapperContained.lastTickTime = value; }
// public static double lastTickTime() { return net.minecraft.client.Mouse.lastTickTime; }
// public static void lastTickTime(double value, ) { net.minecraft.client.Mouse.lastTickTime = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.Mouse.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.Mouse.LOGGER = value; }

public Mouse(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.Mouse(client.wrapperContained); }
// public void onMouseScroll(long window,double horizontal,double vertical) { wrapperContained.onMouseScroll(window,horizontal,vertical); }
// public static void onMouseScroll(long window,double horizontal,double vertical, ) { net.minecraft.client.Mouse.onMouseScroll(window,horizontal,vertical); }
public void onResolutionChanged() { wrapperContained.onResolutionChanged(); }
// public static void onResolutionChanged() { net.minecraft.client.Mouse.onResolutionChanged(); }
// public void onCursorPos(long window,double x,double y) { wrapperContained.onCursorPos(window,x,y); }
// public static void onCursorPos(long window,double x,double y, ) { net.minecraft.client.Mouse.onCursorPos(window,x,y); }
// public void onMouseButton(long window,int button,int action,int mods) { wrapperContained.onMouseButton(window,button,action,mods); }
// public static void onMouseButton(long window,int button,int action,int mods, ) { net.minecraft.client.Mouse.onMouseButton(window,button,action,mods); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.client.Mouse.getX(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.client.Mouse.getY(); }
// public void updateMouse(double timeDelta) { wrapperContained.updateMouse(timeDelta); }
// public static void updateMouse(double timeDelta, ) { net.minecraft.client.Mouse.updateMouse(timeDelta); }
public void setup(long window) { wrapperContained.setup(window); }
// public static void setup(long window, ) { net.minecraft.client.Mouse.setup(window); }
public boolean wasLeftButtonClicked() { return wrapperContained.wasLeftButtonClicked(); }
// public static boolean wasLeftButtonClicked() { return net.minecraft.client.Mouse.wasLeftButtonClicked(); }
public boolean wasRightButtonClicked() { return wrapperContained.wasRightButtonClicked(); }
// public static boolean wasRightButtonClicked() { return net.minecraft.client.Mouse.wasRightButtonClicked(); }
public void unlockCursor() { wrapperContained.unlockCursor(); }
// public static void unlockCursor() { net.minecraft.client.Mouse.unlockCursor(); }
public void lockCursor() { wrapperContained.lockCursor(); }
// public static void lockCursor() { net.minecraft.client.Mouse.lockCursor(); }
public boolean isCursorLocked() { return wrapperContained.isCursorLocked(); }
// public static boolean isCursorLocked() { return net.minecraft.client.Mouse.isCursorLocked(); }
// public void method_22684(long window,int button,int action,int modifiers) { wrapperContained.method_22684(window,button,action,modifiers); }
// public static void method_22684(long window,int button,int action,int modifiers, ) { net.minecraft.client.Mouse.method_22684(window,button,action,modifiers); }
// public void method_22685(long window,double offsetX,double offsetY) { wrapperContained.method_22685(window,offsetX,offsetY); }
// public static void method_22685(long window,double offsetX,double offsetY, ) { net.minecraft.client.Mouse.method_22685(window,offsetX,offsetY); }
// public void method_22688(long window,double x,double y) { wrapperContained.method_22688(window,x,y); }
// public static void method_22688(long window,double x,double y, ) { net.minecraft.client.Mouse.method_22688(window,x,y); }
// public void method_29615(long window,int count,long names) { wrapperContained.method_29615(window,count,names); }
// public static void method_29615(long window,int count,long names, ) { net.minecraft.client.Mouse.method_29615(window,count,names); }
// public void onFilesDropped(long window,java.util.List paths,int invalidFilesCount) { wrapperContained.onFilesDropped(window,paths,invalidFilesCount); }
// public static void onFilesDropped(long window,java.util.List paths,int invalidFilesCount, ) { net.minecraft.client.Mouse.onFilesDropped(window,paths,invalidFilesCount); }
public void setResolutionChanged() { wrapperContained.setResolutionChanged(); }
// public static void setResolutionChanged() { net.minecraft.client.Mouse.setResolutionChanged(); }
public boolean wasMiddleButtonClicked() { return wrapperContained.wasMiddleButtonClicked(); }
// public static boolean wasMiddleButtonClicked() { return net.minecraft.client.Mouse.wasMiddleButtonClicked(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.Mouse.tick(); }

}