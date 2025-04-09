package yarnwrap.client.realms.dto;
public class RealmsNews { public net.minecraft.client.realms.dto.RealmsNews wrapperContained; public RealmsNews(net.minecraft.client.realms.dto.RealmsNews wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String newsLink() { return wrapperContained.newsLink; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.RealmsNews parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsNews(wrapperContained.parse(json)); }

}