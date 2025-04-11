package yarnwrap.item;
public class ShearsItem { public net.minecraft.item.ShearsItem wrapperContained; public ShearsItem(net.minecraft.item.ShearsItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }

}