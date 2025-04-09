package yarnwrap.client.gui.screen;
public class TaskScreen { public net.minecraft.client.gui.screen.TaskScreen wrapperContained; public TaskScreen(net.minecraft.client.gui.screen.TaskScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TITLE_TEXT_Y() { return wrapperContained.TITLE_TEXT_Y; }
// public int DESCRIPTION_TEXT_Y() { return wrapperContained.DESCRIPTION_TEXT_Y; }
// public int DESCRIPTION_TEXT_WIDTH() { return wrapperContained.DESCRIPTION_TEXT_WIDTH; }
// public yarnwrap.text.Text closeButtonText() { return new yarnwrap.text.Text(wrapperContained.closeButtonText); }
// public java.lang.Runnable closeCallback() { return wrapperContained.closeCallback; }
// public yarnwrap.client.font.MultilineText description() { return new yarnwrap.client.font.MultilineText(wrapperContained.description); }
// public yarnwrap.client.gui.widget.ButtonWidget button() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.button); }
// public yarnwrap.text.Text descriptionText() { return new yarnwrap.text.Text(wrapperContained.descriptionText); }
// public int buttonCooldown() { return wrapperContained.buttonCooldown; }
public yarnwrap.client.gui.screen.TaskScreen createRunningScreen(yarnwrap.text.Text title,yarnwrap.text.Text closeButtonText,java.lang.Runnable closeCallback) { return new yarnwrap.client.gui.screen.TaskScreen(wrapperContained.createRunningScreen(title.wrapperContained,closeButtonText.wrapperContained,closeCallback)); }
public yarnwrap.client.gui.screen.TaskScreen createResultScreen(yarnwrap.text.Text title,yarnwrap.text.Text descriptionText,yarnwrap.text.Text closeButtonText,java.lang.Runnable closeCallback) { return new yarnwrap.client.gui.screen.TaskScreen(wrapperContained.createResultScreen(title.wrapperContained,descriptionText.wrapperContained,closeButtonText.wrapperContained,closeCallback)); }

}