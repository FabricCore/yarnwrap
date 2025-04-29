package yarnwrap.client.realms.dto;
public class RealmsNews { public net.minecraft.client.realms.dto.RealmsNews wrapperContained; public RealmsNews(net.minecraft.client.realms.dto.RealmsNews wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String newsLink() { return wrapperContained.newsLink; }
public void newsLink(java.lang.String value) { wrapperContained.newsLink = value; }
// public static java.lang.String newsLink() { return net.minecraft.client.realms.dto.RealmsNews.newsLink; }
// public static void newsLink(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNews.newsLink = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.RealmsNews.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.RealmsNews.LOGGER = value; }

// public yarnwrap.client.realms.dto.RealmsNews parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsNews(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.RealmsNews parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.RealmsNews(net.minecraft.client.realms.dto.RealmsNews.parse(json)); }

}