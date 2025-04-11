package yarnwrap.client.realms;
public class RealmsNewsUpdater { public net.minecraft.client.realms.RealmsNewsUpdater wrapperContained; public RealmsNewsUpdater(net.minecraft.client.realms.RealmsNewsUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.util.RealmsPersistence persistence() { return new yarnwrap.client.realms.util.RealmsPersistence(wrapperContained.persistence); }
// public void persistence(yarnwrap.client.realms.util.RealmsPersistence value) { wrapperContained.persistence = value.wrapperContained; }
// public boolean hasUnreadNews() { return wrapperContained.hasUnreadNews; }
// public void hasUnreadNews(boolean value) { wrapperContained.hasUnreadNews = value; }
// public java.lang.String newsLink() { return wrapperContained.newsLink; }
// public void newsLink(java.lang.String value) { wrapperContained.newsLink = value; }
public RealmsNewsUpdater(yarnwrap.client.realms.util.RealmsPersistence persistence) { this.wrapperContained = new net.minecraft.client.realms.RealmsNewsUpdater(persistence.wrapperContained); }
// public boolean hasUnreadNews() { return wrapperContained.hasUnreadNews(); }
public void updateNews(yarnwrap.client.realms.dto.RealmsNews news) { wrapperContained.updateNews(news.wrapperContained); }
public java.lang.String getNewsLink() { return wrapperContained.getNewsLink(); }
// public Object checkLinkUpdated(yarnwrap.client.realms.dto.RealmsNews news) { return wrapperContained.checkLinkUpdated(news.wrapperContained); }

}