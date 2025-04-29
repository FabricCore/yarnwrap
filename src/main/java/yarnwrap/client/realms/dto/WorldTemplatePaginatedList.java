package yarnwrap.client.realms.dto;
public class WorldTemplatePaginatedList { public net.minecraft.client.realms.dto.WorldTemplatePaginatedList wrapperContained; public WorldTemplatePaginatedList(net.minecraft.client.realms.dto.WorldTemplatePaginatedList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List templates() { return wrapperContained.templates; }
public void templates(java.util.List value) { wrapperContained.templates = value; }
// public static java.util.List templates() { return net.minecraft.client.realms.dto.WorldTemplatePaginatedList.templates; }
// public static void templates(java.util.List value, ) { net.minecraft.client.realms.dto.WorldTemplatePaginatedList.templates = value; }

public int page() { return wrapperContained.page; }
public void page(int value) { wrapperContained.page = value; }
// public static int page() { return net.minecraft.client.realms.dto.WorldTemplatePaginatedList.page; }
// public static void page(int value, ) { net.minecraft.client.realms.dto.WorldTemplatePaginatedList.page = value; }

public int size() { return wrapperContained.size; }
public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.realms.dto.WorldTemplatePaginatedList.size; }
// public static void size(int value, ) { net.minecraft.client.realms.dto.WorldTemplatePaginatedList.size = value; }

public int total() { return wrapperContained.total; }
public void total(int value) { wrapperContained.total = value; }
// public static int total() { return net.minecraft.client.realms.dto.WorldTemplatePaginatedList.total; }
// public static void total(int value, ) { net.minecraft.client.realms.dto.WorldTemplatePaginatedList.total = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.WorldTemplatePaginatedList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.WorldTemplatePaginatedList.LOGGER = value; }

public WorldTemplatePaginatedList(int size) { this.wrapperContained = new net.minecraft.client.realms.dto.WorldTemplatePaginatedList(size); }
// public yarnwrap.client.realms.dto.WorldTemplatePaginatedList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.WorldTemplatePaginatedList parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(net.minecraft.client.realms.dto.WorldTemplatePaginatedList.parse(json)); }
public boolean isLastPage() { return wrapperContained.isLastPage(); }
// public static boolean isLastPage() { return net.minecraft.client.realms.dto.WorldTemplatePaginatedList.isLastPage(); }

}