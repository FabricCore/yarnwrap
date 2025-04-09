package yarnwrap.client.realms.gui.screen;
public class RealmsCreateWorldScreen { public net.minecraft.client.realms.gui.screen.RealmsCreateWorldScreen wrapperContained; public RealmsCreateWorldScreen(net.minecraft.client.realms.gui.screen.RealmsCreateWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public int slot() { return wrapperContained.slot; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(wrapperContained.subtitle); }
// public int subtitleColor() { return wrapperContained.subtitleColor; }
// public yarnwrap.client.realms.dto.WorldTemplatePaginatedList normalWorldTemplates() { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.normalWorldTemplates); }
// public yarnwrap.client.realms.dto.WorldTemplatePaginatedList adventureWorldTemplates() { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.adventureWorldTemplates); }
// public yarnwrap.client.realms.dto.WorldTemplatePaginatedList experienceWorldTemplates() { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.experienceWorldTemplates); }
// public yarnwrap.client.realms.dto.WorldTemplatePaginatedList inspirationWorldTemplates() { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.inspirationWorldTemplates); }
// public yarnwrap.text.Text taskTitle() { return new yarnwrap.text.Text(wrapperContained.taskTitle); }
// public yarnwrap.util.Identifier NEW_WORLD_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.NEW_WORLD_TEXTURE); }
// public yarnwrap.util.Identifier EXPERIENCE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_TEXTURE); }
// public yarnwrap.util.Identifier INSPIRATION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INSPIRATION_TEXTURE); }
// public java.lang.Runnable callback() { return wrapperContained.callback; }
// public yarnwrap.util.Identifier UPLOAD_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.UPLOAD_TEXTURE); }
// public yarnwrap.util.Identifier ADVENTURE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ADVENTURE_TEXTURE); }
// public yarnwrap.util.Identifier SURVIVAL_SPAWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SURVIVAL_SPAWN_TEXTURE); }
// public yarnwrap.text.Text CREATE_REALM_SUBTITLE() { return new yarnwrap.text.Text(wrapperContained.CREATE_REALM_SUBTITLE); }
// public yarnwrap.text.Text CREATE_WORLD_TITLE() { return new yarnwrap.text.Text(wrapperContained.CREATE_WORLD_TITLE); }
// public yarnwrap.text.Text CREATE_WORLD_SUBTITLE() { return new yarnwrap.text.Text(wrapperContained.CREATE_WORLD_SUBTITLE); }
// public yarnwrap.text.Text RESET_WORLD_TITLE() { return new yarnwrap.text.Text(wrapperContained.RESET_WORLD_TITLE); }
// public yarnwrap.text.Text RESET_WORLD_SUBTITLE() { return new yarnwrap.text.Text(wrapperContained.RESET_WORLD_SUBTITLE); }
// public yarnwrap.text.Text RESETTING_TEXT() { return new yarnwrap.text.Text(wrapperContained.RESETTING_TEXT); }
// public yarnwrap.text.Text TEMPLATE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TEMPLATE_TEXT); }
// public yarnwrap.text.Text ADVENTURE_TEXT() { return new yarnwrap.text.Text(wrapperContained.ADVENTURE_TEXT); }
// public yarnwrap.text.Text EXPERIENCE_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPERIENCE_TEXT); }
// public yarnwrap.text.Text INSPIRATION_TEXT() { return new yarnwrap.text.Text(wrapperContained.INSPIRATION_TEXT); }
public yarnwrap.text.Text CREATING_TEXT() { return new yarnwrap.text.Text(wrapperContained.CREATING_TEXT); }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public yarnwrap.text.Text CREATE_REALM_TITLE() { return new yarnwrap.text.Text(wrapperContained.CREATE_REALM_TITLE); }
// public yarnwrap.client.realms.task.WorldCreationTask creationTask() { return new yarnwrap.client.realms.task.WorldCreationTask(wrapperContained.creationTask); }
// public void onSelectWorldTemplate(yarnwrap.client.realms.dto.WorldTemplate template) { wrapperContained.onSelectWorldTemplate(template.wrapperContained); }
// public void onResetNormalWorld(yarnwrap.client.realms.gui.screen.ResetWorldInfo info) { wrapperContained.onResetNormalWorld(info.wrapperContained); }
public yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen newWorld(yarnwrap.client.gui.screen.Screen parent,int slot,yarnwrap.client.realms.dto.RealmsServer serverData,java.lang.Runnable callback) { return new yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen(wrapperContained.newWorld(parent.wrapperContained,slot,serverData.wrapperContained,callback)); }
public yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen newRealm(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.realms.dto.RealmsServer serverData,yarnwrap.client.realms.task.WorldCreationTask creationTask,java.lang.Runnable callback) { return new yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen(wrapperContained.newRealm(parent.wrapperContained,serverData.wrapperContained,creationTask.wrapperContained,callback)); }
public yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen resetWorld(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.realms.dto.RealmsServer serverData,java.lang.Runnable callback) { return new yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen(wrapperContained.resetWorld(parent.wrapperContained,serverData.wrapperContained,callback)); }
// public void runTasks(yarnwrap.client.realms.task.LongRunningTask task) { wrapperContained.runTasks(task.wrapperContained); }

}