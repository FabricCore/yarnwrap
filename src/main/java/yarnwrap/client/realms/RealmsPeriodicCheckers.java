package yarnwrap.client.realms;
public class RealmsPeriodicCheckers { public net.minecraft.client.realms.RealmsPeriodicCheckers wrapperContained; public RealmsPeriodicCheckers(net.minecraft.client.realms.RealmsPeriodicCheckers wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.realms.util.PeriodicRunnerFactory runnerFactory() { return new yarnwrap.client.realms.util.PeriodicRunnerFactory(wrapperContained.runnerFactory); }
// public void runnerFactory(yarnwrap.client.realms.util.PeriodicRunnerFactory value) { wrapperContained.runnerFactory = value.wrapperContained; }
// public static yarnwrap.client.realms.util.PeriodicRunnerFactory runnerFactory() { return new yarnwrap.client.realms.util.PeriodicRunnerFactory(net.minecraft.client.realms.RealmsPeriodicCheckers.runnerFactory); }
// public static void runnerFactory(yarnwrap.client.realms.util.PeriodicRunnerFactory value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.runnerFactory = value.wrapperContained; }

public Object serverList() { return wrapperContained.serverList; }
// // public void serverList(Object value) { wrapperContained.serverList = value; }
// // public static Object serverList() { return net.minecraft.client.realms.RealmsPeriodicCheckers.serverList; }
// // public static void serverList(Object value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.serverList = value; }

public Object pendingInvitesCount() { return wrapperContained.pendingInvitesCount; }
// // public void pendingInvitesCount(Object value) { wrapperContained.pendingInvitesCount = value; }
// // public static Object pendingInvitesCount() { return net.minecraft.client.realms.RealmsPeriodicCheckers.pendingInvitesCount; }
// // public static void pendingInvitesCount(Object value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.pendingInvitesCount = value; }

public Object trialAvailability() { return wrapperContained.trialAvailability; }
// // public void trialAvailability(Object value) { wrapperContained.trialAvailability = value; }
// // public static Object trialAvailability() { return net.minecraft.client.realms.RealmsPeriodicCheckers.trialAvailability; }
// // public static void trialAvailability(Object value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.trialAvailability = value; }

public Object news() { return wrapperContained.news; }
// // public void news(Object value) { wrapperContained.news = value; }
// // public static Object news() { return net.minecraft.client.realms.RealmsPeriodicCheckers.news; }
// // public static void news(Object value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.news = value; }

public yarnwrap.client.realms.RealmsNewsUpdater newsUpdater() { return new yarnwrap.client.realms.RealmsNewsUpdater(wrapperContained.newsUpdater); }
// public void newsUpdater(yarnwrap.client.realms.RealmsNewsUpdater value) { wrapperContained.newsUpdater = value.wrapperContained; }
// public static yarnwrap.client.realms.RealmsNewsUpdater newsUpdater() { return new yarnwrap.client.realms.RealmsNewsUpdater(net.minecraft.client.realms.RealmsPeriodicCheckers.newsUpdater); }
// public static void newsUpdater(yarnwrap.client.realms.RealmsNewsUpdater value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.newsUpdater = value.wrapperContained; }

public Object notifications() { return wrapperContained.notifications; }
// // public void notifications(Object value) { wrapperContained.notifications = value; }
// // public static Object notifications() { return net.minecraft.client.realms.RealmsPeriodicCheckers.notifications; }
// // public static void notifications(Object value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.notifications = value; }

// public java.util.List checkers() { return wrapperContained.checkers; }
// public void checkers(java.util.List value) { wrapperContained.checkers = value; }
// public static java.util.List checkers() { return net.minecraft.client.realms.RealmsPeriodicCheckers.checkers; }
// public static void checkers(java.util.List value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.checkers = value; }

public Object onlinePlayers() { return wrapperContained.onlinePlayers; }
// // public void onlinePlayers(Object value) { wrapperContained.onlinePlayers = value; }
// // public static Object onlinePlayers() { return net.minecraft.client.realms.RealmsPeriodicCheckers.onlinePlayers; }
// // public static void onlinePlayers(Object value, ) { net.minecraft.client.realms.RealmsPeriodicCheckers.onlinePlayers = value; }

public RealmsPeriodicCheckers(yarnwrap.client.realms.RealmsClient client) { this.wrapperContained = new net.minecraft.client.realms.RealmsPeriodicCheckers(client.wrapperContained); }
public java.util.List getCheckers() { return wrapperContained.getCheckers(); }
// public static java.util.List getCheckers() { return net.minecraft.client.realms.RealmsPeriodicCheckers.getCheckers(); }

}