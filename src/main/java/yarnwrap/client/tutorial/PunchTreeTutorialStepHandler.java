package yarnwrap.client.tutorial;
public class PunchTreeTutorialStepHandler { public net.minecraft.client.tutorial.PunchTreeTutorialStepHandler wrapperContained; public PunchTreeTutorialStepHandler(net.minecraft.client.tutorial.PunchTreeTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DELAY() { return wrapperContained.DELAY; }
// public void DELAY(int value) { wrapperContained.DELAY = value; }
// public static int DELAY() { return net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.DELAY; }
// public static void DELAY(int value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.DELAY = value; }

// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public void manager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.manager); }
// public static void manager(yarnwrap.client.tutorial.TutorialManager value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.manager = value.wrapperContained; }

// public int punches() { return wrapperContained.punches; }
// public void punches(int value) { wrapperContained.punches = value; }
// public static int punches() { return net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.punches; }
// public static void punches(int value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.punches = value; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.ticks = value; }

// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public void toast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.toast = value.wrapperContained; }
// public static yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.toast); }
// public static void toast(yarnwrap.client.toast.TutorialToast value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.toast = value.wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.TITLE = value.wrapperContained; }

// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public void DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.DESCRIPTION = value.wrapperContained; }
// public static yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.DESCRIPTION); }
// public static void DESCRIPTION(yarnwrap.text.Text value, ) { net.minecraft.client.tutorial.PunchTreeTutorialStepHandler.DESCRIPTION = value.wrapperContained; }

public PunchTreeTutorialStepHandler(yarnwrap.client.tutorial.TutorialManager manager) { this.wrapperContained = new net.minecraft.client.tutorial.PunchTreeTutorialStepHandler(manager.wrapperContained); }

}