package yarnwrap.client.realms;
public class RealmsPeriodicCheckers { public net.minecraft.client.realms.RealmsPeriodicCheckers wrapperContained; public RealmsPeriodicCheckers(net.minecraft.client.realms.RealmsPeriodicCheckers wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.realms.util.PeriodicRunnerFactory runnerFactory() { return new yarnwrap.client.realms.util.PeriodicRunnerFactory(wrapperContained.runnerFactory); }
public Object serverList() { return wrapperContained.serverList; }
public Object pendingInvitesCount() { return wrapperContained.pendingInvitesCount; }
public Object trialAvailability() { return wrapperContained.trialAvailability; }
public Object news() { return wrapperContained.news; }
public yarnwrap.client.realms.RealmsNewsUpdater newsUpdater() { return new yarnwrap.client.realms.RealmsNewsUpdater(wrapperContained.newsUpdater); }
public Object notifications() { return wrapperContained.notifications; }
// public java.util.List checkers() { return wrapperContained.checkers; }
public Object onlinePlayers() { return wrapperContained.onlinePlayers; }
public java.util.List getCheckers() { return wrapperContained.getCheckers(); }

}