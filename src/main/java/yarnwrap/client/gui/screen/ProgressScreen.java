package yarnwrap.client.gui.screen;
public class ProgressScreen { public net.minecraft.client.gui.screen.ProgressScreen wrapperContained; public ProgressScreen(net.minecraft.client.gui.screen.ProgressScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public int progress() { return wrapperContained.progress; }
// public void progress(int value) { wrapperContained.progress = value; }
// public boolean done() { return wrapperContained.done; }
// public void done(boolean value) { wrapperContained.done = value; }
// public yarnwrap.text.Text task() { return new yarnwrap.text.Text(wrapperContained.task); }
// public void task(yarnwrap.text.Text value) { wrapperContained.task = value.wrapperContained; }
// public boolean closeAfterFinished() { return wrapperContained.closeAfterFinished; }
// public void closeAfterFinished(boolean value) { wrapperContained.closeAfterFinished = value; }

}