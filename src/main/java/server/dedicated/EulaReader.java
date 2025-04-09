package yarnwrap.server.dedicated;
public class EulaReader { public net.minecraft.server.dedicated.EulaReader wrapperContained; public EulaReader(net.minecraft.server.dedicated.EulaReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean eulaAgreedTo() { return wrapperContained.eulaAgreedTo; }
// public java.nio.file.Path eulaFile() { return wrapperContained.eulaFile; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public boolean isEulaAgreedTo() { return wrapperContained.isEulaAgreedTo(); }
// public boolean checkEulaAgreement() { return wrapperContained.checkEulaAgreement(); }
// public void createEulaFile() { wrapperContained.createEulaFile(); }

}