package yarnwrap.resource;
public class ResourcePackInfo { public net.minecraft.resource.ResourcePackInfo wrapperContained; public ResourcePackInfo(net.minecraft.resource.ResourcePackInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getInformationText(boolean enabled,yarnwrap.text.Text description) { return new yarnwrap.text.Text(wrapperContained.getInformationText(enabled,description.wrapperContained)); }
// public static yarnwrap.text.Text getInformationText(boolean enabled,yarnwrap.text.Text description, ) { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackInfo.getInformationText(enabled,description.wrapperContained)); }
// public yarnwrap.text.Style method_56928(boolean style) { return new yarnwrap.text.Style(wrapperContained.method_56928(style)); }
// public static yarnwrap.text.Style method_56928(boolean style, ) { return new yarnwrap.text.Style(net.minecraft.resource.ResourcePackInfo.method_56928(style)); }

}