package yarnwrap.client.gui.screen;
public class ProgressScreen { public net.minecraft.client.gui.screen.ProgressScreen wrapperContained; public ProgressScreen(net.minecraft.client.gui.screen.ProgressScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public int progress() { return wrapperContained.progress; }
// public boolean done() { return wrapperContained.done; }
// public yarnwrap.text.Text task() { return new yarnwrap.text.Text(wrapperContained.task); }
// public boolean closeAfterFinished() { return wrapperContained.closeAfterFinished; }

}