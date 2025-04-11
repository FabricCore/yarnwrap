package yarnwrap.client.session.report;
public class SkinAbuseReport { public net.minecraft.client.session.report.SkinAbuseReport wrapperContained; public SkinAbuseReport(net.minecraft.client.session.report.SkinAbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier skinSupplier() { return wrapperContained.skinSupplier; }
// public void skinSupplier(java.util.function.Supplier value) { wrapperContained.skinSupplier = value; }
public java.util.function.Supplier getSkinSupplier() { return wrapperContained.getSkinSupplier(); }

}