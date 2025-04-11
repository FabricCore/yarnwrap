package yarnwrap.screen;
public class SimpleNamedScreenHandlerFactory { public net.minecraft.screen.SimpleNamedScreenHandlerFactory wrapperContained; public SimpleNamedScreenHandlerFactory(net.minecraft.screen.SimpleNamedScreenHandlerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandlerFactory baseFactory() { return new yarnwrap.screen.ScreenHandlerFactory(wrapperContained.baseFactory); }
// public void baseFactory(yarnwrap.screen.ScreenHandlerFactory value) { wrapperContained.baseFactory = value.wrapperContained; }
// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }

}