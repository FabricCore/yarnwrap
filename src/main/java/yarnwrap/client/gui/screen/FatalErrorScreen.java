package yarnwrap.client.gui.screen;
public class FatalErrorScreen { public net.minecraft.client.gui.screen.FatalErrorScreen wrapperContained; public FatalErrorScreen(net.minecraft.client.gui.screen.FatalErrorScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }

}