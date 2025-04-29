package yarnwrap.client.session;
public class BanReason { public net.minecraft.client.session.BanReason wrapperContained; public BanReason(net.minecraft.client.session.BanReason wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public static yarnwrap.text.Text description() { return new yarnwrap.text.Text(net.minecraft.client.session.BanReason.description); }
// public static void description(yarnwrap.text.Text value, ) { net.minecraft.client.session.BanReason.description = value.wrapperContained; }

// public BanReason(java.lang.String id) { this.wrapperContained = new net.minecraft.client.session.BanReason(id); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
// public static yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(net.minecraft.client.session.BanReason.getDescription()); }
// public yarnwrap.client.session.BanReason byId(int id) { return new yarnwrap.client.session.BanReason(wrapperContained.byId(id)); }
// public static yarnwrap.client.session.BanReason byId(int id, ) { return new yarnwrap.client.session.BanReason(net.minecraft.client.session.BanReason.byId(id)); }

}