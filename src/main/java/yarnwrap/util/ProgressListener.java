package yarnwrap.util;
public class ProgressListener { public net.minecraft.util.ProgressListener wrapperContained; public ProgressListener(net.minecraft.util.ProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void progressStagePercentage(int percentage) { wrapperContained.progressStagePercentage(percentage); }
// public static void progressStagePercentage(int percentage, ) { net.minecraft.util.ProgressListener.progressStagePercentage(percentage); }
public void setDone() { wrapperContained.setDone(); }
// public static void setDone() { net.minecraft.util.ProgressListener.setDone(); }
public void setTitle(yarnwrap.text.Text title) { wrapperContained.setTitle(title.wrapperContained); }
// public static void setTitle(yarnwrap.text.Text title, ) { net.minecraft.util.ProgressListener.setTitle(title.wrapperContained); }
public void setTitleAndTask(yarnwrap.text.Text title) { wrapperContained.setTitleAndTask(title.wrapperContained); }
// public static void setTitleAndTask(yarnwrap.text.Text title, ) { net.minecraft.util.ProgressListener.setTitleAndTask(title.wrapperContained); }
public void setTask(yarnwrap.text.Text task) { wrapperContained.setTask(task.wrapperContained); }
// public static void setTask(yarnwrap.text.Text task, ) { net.minecraft.util.ProgressListener.setTask(task.wrapperContained); }

}