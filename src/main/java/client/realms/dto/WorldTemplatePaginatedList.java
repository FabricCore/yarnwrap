package yarnwrap.client.realms.dto;
public class WorldTemplatePaginatedList { public net.minecraft.client.realms.dto.WorldTemplatePaginatedList wrapperContained; public WorldTemplatePaginatedList(net.minecraft.client.realms.dto.WorldTemplatePaginatedList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List templates() { return wrapperContained.templates; }
public int page() { return wrapperContained.page; }
public int size() { return wrapperContained.size; }
public int total() { return wrapperContained.total; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.WorldTemplatePaginatedList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.parse(json)); }
public boolean isLastPage() { return wrapperContained.isLastPage(); }

}