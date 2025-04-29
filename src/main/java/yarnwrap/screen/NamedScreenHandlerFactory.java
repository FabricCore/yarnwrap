package yarnwrap.screen;
public class NamedScreenHandlerFactory { public net.minecraft.screen.NamedScreenHandlerFactory wrapperContained; public NamedScreenHandlerFactory(net.minecraft.screen.NamedScreenHandlerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.screen.NamedScreenHandlerFactory.getDisplayName()); }

}