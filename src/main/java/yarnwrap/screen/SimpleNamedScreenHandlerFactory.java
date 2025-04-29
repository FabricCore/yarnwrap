package yarnwrap.screen;
public class SimpleNamedScreenHandlerFactory { public net.minecraft.screen.SimpleNamedScreenHandlerFactory wrapperContained; public SimpleNamedScreenHandlerFactory(net.minecraft.screen.SimpleNamedScreenHandlerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandlerFactory baseFactory() { return new yarnwrap.screen.ScreenHandlerFactory(wrapperContained.baseFactory); }
// public void baseFactory(yarnwrap.screen.ScreenHandlerFactory value) { wrapperContained.baseFactory = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerFactory baseFactory() { return new yarnwrap.screen.ScreenHandlerFactory(net.minecraft.screen.SimpleNamedScreenHandlerFactory.baseFactory); }
// public static void baseFactory(yarnwrap.screen.ScreenHandlerFactory value, ) { net.minecraft.screen.SimpleNamedScreenHandlerFactory.baseFactory = value.wrapperContained; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.screen.SimpleNamedScreenHandlerFactory.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.screen.SimpleNamedScreenHandlerFactory.name = value.wrapperContained; }

public SimpleNamedScreenHandlerFactory(yarnwrap.screen.ScreenHandlerFactory baseFactory,yarnwrap.text.Text name) { this.wrapperContained = new net.minecraft.screen.SimpleNamedScreenHandlerFactory(baseFactory.wrapperContained,name.wrapperContained); }

}