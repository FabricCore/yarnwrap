package yarnwrap.client.realms.task;
public class ResettingWorldTemplateTask { public net.minecraft.client.realms.task.ResettingWorldTemplateTask wrapperContained; public ResettingWorldTemplateTask(net.minecraft.client.realms.task.ResettingWorldTemplateTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.WorldTemplate template() { return new yarnwrap.client.realms.dto.WorldTemplate(wrapperContained.template); }
// public void template(yarnwrap.client.realms.dto.WorldTemplate value) { wrapperContained.template = value.wrapperContained; }

}