package yarnwrap.client.realms;
public class RealmsPeriodicCheckers { public net.minecraft.client.realms.RealmsPeriodicCheckers wrapperContained; public RealmsPeriodicCheckers(net.minecraft.client.realms.RealmsPeriodicCheckers wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.realms.util.PeriodicRunnerFactory runnerFactory() { return new yarnwrap.client.realms.util.PeriodicRunnerFactory(wrapperContained.runnerFactory); }
// public void runnerFactory(yarnwrap.client.realms.util.PeriodicRunnerFactory value) { wrapperContained.runnerFactory = value.wrapperContained; }
public Object serverList() { return wrapperContained.serverList; }
// // public void serverList(Object value) { wrapperContained.serverList = value; }
public Object pendingInvitesCount() { return wrapperContained.pendingInvitesCount; }
// // public void pendingInvitesCount(Object value) { wrapperContained.pendingInvitesCount = value; }
public Object trialAvailability() { return wrapperContained.trialAvailability; }
// // public void trialAvailability(Object value) { wrapperContained.trialAvailability = value; }
public Object news() { return wrapperContained.news; }
// // public void news(Object value) { wrapperContained.news = value; }
public yarnwrap.client.realms.RealmsNewsUpdater newsUpdater() { return new yarnwrap.client.realms.RealmsNewsUpdater(wrapperContained.newsUpdater); }
// public void newsUpdater(yarnwrap.client.realms.RealmsNewsUpdater value) { wrapperContained.newsUpdater = value.wrapperContained; }
public Object notifications() { return wrapperContained.notifications; }
// // public void notifications(Object value) { wrapperContained.notifications = value; }
// public java.util.List checkers() { return wrapperContained.checkers; }
// public void checkers(java.util.List value) { wrapperContained.checkers = value; }
public Object onlinePlayers() { return wrapperContained.onlinePlayers; }
// // public void onlinePlayers(Object value) { wrapperContained.onlinePlayers = value; }
public RealmsPeriodicCheckers(yarnwrap.client.realms.RealmsClient client) { this.wrapperContained = new net.minecraft.client.realms.RealmsPeriodicCheckers(client.wrapperContained); }
public java.util.List getCheckers() { return wrapperContained.getCheckers(); }

}