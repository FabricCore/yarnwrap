package yarnwrap.client.gui.screen;
public class ProgressScreen { public net.minecraft.client.gui.screen.ProgressScreen wrapperContained; public ProgressScreen(net.minecraft.client.gui.screen.ProgressScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public static yarnwrap.text.Text title() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ProgressScreen.title); }
// public static void title(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ProgressScreen.title = value.wrapperContained; }

// public int progress() { return wrapperContained.progress; }
// public void progress(int value) { wrapperContained.progress = value; }
// public static int progress() { return net.minecraft.client.gui.screen.ProgressScreen.progress; }
// public static void progress(int value, ) { net.minecraft.client.gui.screen.ProgressScreen.progress = value; }

// public boolean done() { return wrapperContained.done; }
// public void done(boolean value) { wrapperContained.done = value; }
// public static boolean done() { return net.minecraft.client.gui.screen.ProgressScreen.done; }
// public static void done(boolean value, ) { net.minecraft.client.gui.screen.ProgressScreen.done = value; }

// public yarnwrap.text.Text task() { return new yarnwrap.text.Text(wrapperContained.task); }
// public void task(yarnwrap.text.Text value) { wrapperContained.task = value.wrapperContained; }
// public static yarnwrap.text.Text task() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ProgressScreen.task); }
// public static void task(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ProgressScreen.task = value.wrapperContained; }

// public boolean closeAfterFinished() { return wrapperContained.closeAfterFinished; }
// public void closeAfterFinished(boolean value) { wrapperContained.closeAfterFinished = value; }
// public static boolean closeAfterFinished() { return net.minecraft.client.gui.screen.ProgressScreen.closeAfterFinished; }
// public static void closeAfterFinished(boolean value, ) { net.minecraft.client.gui.screen.ProgressScreen.closeAfterFinished = value; }

public ProgressScreen(boolean closeAfterFinished) { this.wrapperContained = new net.minecraft.client.gui.screen.ProgressScreen(closeAfterFinished); }

}