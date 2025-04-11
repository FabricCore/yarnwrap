package yarnwrap.client.realms.dto;
public class WorldTemplatePaginatedList { public net.minecraft.client.realms.dto.WorldTemplatePaginatedList wrapperContained; public WorldTemplatePaginatedList(net.minecraft.client.realms.dto.WorldTemplatePaginatedList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List templates() { return wrapperContained.templates; }
public void templates(java.util.List value) { wrapperContained.templates = value; }
public int page() { return wrapperContained.page; }
public void page(int value) { wrapperContained.page = value; }
public int size() { return wrapperContained.size; }
public void size(int value) { wrapperContained.size = value; }
public int total() { return wrapperContained.total; }
public void total(int value) { wrapperContained.total = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.realms.dto.WorldTemplatePaginatedList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.parse(json)); }
public boolean isLastPage() { return wrapperContained.isLastPage(); }

}