package yarnwrap.resource;
public class ResourcePackInfo { public net.minecraft.resource.ResourcePackInfo wrapperContained; public ResourcePackInfo(net.minecraft.resource.ResourcePackInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getInformationText(boolean enabled,yarnwrap.text.Text description) { return new yarnwrap.text.Text(wrapperContained.getInformationText(enabled,description.wrapperContained)); }

}