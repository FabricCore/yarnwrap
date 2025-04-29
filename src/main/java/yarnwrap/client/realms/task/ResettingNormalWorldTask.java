package yarnwrap.client.realms.task;
public class ResettingNormalWorldTask { public net.minecraft.client.realms.task.ResettingNormalWorldTask wrapperContained; public ResettingNormalWorldTask(net.minecraft.client.realms.task.ResettingNormalWorldTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.gui.screen.ResetWorldInfo info() { return new yarnwrap.client.realms.gui.screen.ResetWorldInfo(wrapperContained.info); }
// public void info(yarnwrap.client.realms.gui.screen.ResetWorldInfo value) { wrapperContained.info = value.wrapperContained; }
// public static yarnwrap.client.realms.gui.screen.ResetWorldInfo info() { return new yarnwrap.client.realms.gui.screen.ResetWorldInfo(net.minecraft.client.realms.task.ResettingNormalWorldTask.info); }
// public static void info(yarnwrap.client.realms.gui.screen.ResetWorldInfo value, ) { net.minecraft.client.realms.task.ResettingNormalWorldTask.info = value.wrapperContained; }

public ResettingNormalWorldTask(yarnwrap.client.realms.gui.screen.ResetWorldInfo info,long serverId,yarnwrap.text.Text title,java.lang.Runnable callback) { this.wrapperContained = new net.minecraft.client.realms.task.ResettingNormalWorldTask(info.wrapperContained,serverId,title.wrapperContained,callback); }

}