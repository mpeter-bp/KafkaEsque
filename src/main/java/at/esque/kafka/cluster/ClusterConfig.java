package at.esque.kafka.cluster;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClusterConfig {
    private StringProperty identifier = new SimpleStringProperty();
    private StringProperty bootStrapServers = new SimpleStringProperty();
    private StringProperty schemaRegistry = new SimpleStringProperty();
    private StringProperty schemaRegistryBasicAuthUserInfo = new SimpleStringProperty();
    private BooleanProperty schemaRegistryUseSsl = new SimpleBooleanProperty();
    private BooleanProperty sslEnabled = new SimpleBooleanProperty();
    private BooleanProperty certPathValidationSuppressed = new SimpleBooleanProperty();
    private StringProperty keyStoreLocation = new SimpleStringProperty();
    private StringProperty keyStorePassword = new SimpleStringProperty();
    private StringProperty trustStoreLocation = new SimpleStringProperty();
    private StringProperty trustStorePassword = new SimpleStringProperty();
    private StringProperty saslSecurityProtocol = new SimpleStringProperty();
    private StringProperty saslMechanism = new SimpleStringProperty();
    private StringProperty saslClientCallbackHandlerClass = new SimpleStringProperty();
    private StringProperty saslJaasConfig = new SimpleStringProperty();
    private StringProperty kafkaConnectUrl = new SimpleStringProperty();
    private StringProperty kafkaConnectBasicAuthUser = new SimpleStringProperty();
    private StringProperty kafkaConnectBasicAuthPassword = new SimpleStringProperty();
    private BooleanProperty kafkaConnectuseSsl = new SimpleBooleanProperty();
    private BooleanProperty suppressSslEndPointIdentification = new SimpleBooleanProperty();

    public ClusterConfig() {
    }

    public ClusterConfig(ClusterConfig existingConfig) {
        update(existingConfig);
    }

    public void update(ClusterConfig existingConfig) {
        if(existingConfig != null) {
            this.setIdentifier(existingConfig.getIdentifier());
            this.setBootStrapServers(existingConfig.getBootStrapServers());
            this.setSchemaRegistry(existingConfig.getSchemaRegistry());
            this.setSchemaRegistryBasicAuthUserInfo(existingConfig.getSchemaRegistryBasicAuthUserInfo());
            this.setSchemaRegistryUseSsl(existingConfig.isSchemaRegistryUseSsl());
            this.setSchemaRegistrySuppressCertPathValidation(existingConfig.isSchemaRegistrySuppressCertPathValidation());
            this.setSslEnabled(existingConfig.isSslEnabled());
            this.setKeyStoreLocation(existingConfig.getKeyStoreLocation());
            this.setKeyStorePassword(existingConfig.getKeyStorePassword());
            this.setTrustStoreLocation(existingConfig.getTrustStoreLocation());
            this.setTrustStorePassword(existingConfig.getTrustStorePassword());
            this.setSaslSecurityProtocol(existingConfig.getSaslSecurityProtocol());
            this.setSaslMechanism(existingConfig.getSaslMechanism());
            this.setSaslClientCallbackHandlerClass(existingConfig.getSaslClientCallbackHandlerClass());
            this.setSaslJaasConfig(existingConfig.getSaslJaasConfig());
            this.setkafkaConnectUrl(existingConfig.getkafkaConnectUrl());
            this.setkafkaConnectBasicAuthUser(existingConfig.getkafkaConnectBasicAuthUser());
            this.setkafkaConnectBasicAuthPassword(existingConfig.getkafkaConnectBasicAuthPassword());
            this.setKafkaConnectuseSsl(existingConfig.isKafkaConnectuseSsl());
            this.setsuppressSslEndPointIdentification(existingConfig.issuppressSslEndPointIdentification());
        }
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier.get();
    }

    public StringProperty identifierProperty() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier.set(identifier);
    }

    @JsonProperty("bootstrapServers")
    public String getBootStrapServers() {
        return bootStrapServers.get();
    }

    public StringProperty bootStrapServersProperty() {
        return bootStrapServers;
    }

    public void setBootStrapServers(String bootStrapServers) {
        this.bootStrapServers.set(bootStrapServers);
    }

    @JsonProperty("schemaRegistry")
    public String getSchemaRegistry() {
        return schemaRegistry.get();
    }

    public StringProperty schemaRegistryProperty() {
        return schemaRegistry;
    }

    public void setSchemaRegistry(String schemaRegistry) {
        this.schemaRegistry.set(schemaRegistry);
    }

    @JsonProperty("sslEnabled")
    public boolean isSslEnabled() {
        return sslEnabled.get();
    }

    public BooleanProperty sslEnabledProperty() {
        return sslEnabled;
    }

    public void setSslEnabled(boolean sslEnabled) {
        this.sslEnabled.set(sslEnabled);
    }

    @JsonProperty("certPathValidationSuppressed")
    public boolean isSchemaRegistrySuppressCertPathValidation() {
        return certPathValidationSuppressed.get();
    }
    public BooleanProperty suppressCertPathValidation() {
        return certPathValidationSuppressed;
    }

    public void setSchemaRegistrySuppressCertPathValidation(boolean suppressCertPathValidation) {
        this.certPathValidationSuppressed.set(suppressCertPathValidation);
    }

    @JsonProperty("keyStoreLocation")
    public String getKeyStoreLocation() {
        return keyStoreLocation.get();
    }

    public StringProperty keyStoreLocationProperty() {
        return keyStoreLocation;
    }

    public void setKeyStoreLocation(String keyStoreLocation) {
        this.keyStoreLocation.set(keyStoreLocation);
    }

    @JsonProperty("keyStorePassword")
    public String getKeyStorePassword() {
        return keyStorePassword.get();
    }

    public StringProperty keyStorePasswordProperty() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword.set(keyStorePassword);
    }

    @JsonProperty("trustStoreLocation")
    public String getTrustStoreLocation() {
        return trustStoreLocation.get();
    }

    public StringProperty trustStoreLocationProperty() {
        return trustStoreLocation;
    }

    public void setTrustStoreLocation(String trustStoreLocation) {
        this.trustStoreLocation.set(trustStoreLocation);
    }

    @JsonProperty("trustStorePassword")
    public String getTrustStorePassword() {
        return trustStorePassword.get();
    }

    public StringProperty trustStorePasswordProperty() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword.set(trustStorePassword);
    }


    @JsonProperty("saslSecurityProtocol")
    public String getSaslSecurityProtocol() {
        return saslSecurityProtocol.get();
    }

    public StringProperty saslSecurityProtocolProperty() {
        return saslSecurityProtocol;
    }

    public void setSaslSecurityProtocol(String saslSecurityProtocol) {
        this.saslSecurityProtocol.set(saslSecurityProtocol);
    }

    @JsonProperty("saslMechanism")
    public String getSaslMechanism() {
        return saslMechanism.get();
    }

    public StringProperty saslMechanismProperty() {
        return saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism.set(saslMechanism);
    }

    @JsonProperty("saslClientCallbackHandlerClass")
    public String getSaslClientCallbackHandlerClass() {
        return saslClientCallbackHandlerClass.get();
    }

    public StringProperty saslClientCallbackHandlerClassProperty() {
        return saslClientCallbackHandlerClass;
    }

    public void setSaslClientCallbackHandlerClass(String saslClientCallbackHandlerClass) {
        this.saslClientCallbackHandlerClass.set(saslClientCallbackHandlerClass);
    }

    @JsonProperty("saslJaasConfig")
    public String getSaslJaasConfig() {
        return saslJaasConfig.get();
    }

    public StringProperty saslJaasConfigProperty() {
        return saslJaasConfig;
    }

    public void setSaslJaasConfig(String saslJaasConfig) {
        this.saslJaasConfig.set(saslJaasConfig);
    }

    @JsonProperty("schemaRegistryBasicAuthUserInfo")
    public String getSchemaRegistryBasicAuthUserInfo() {
        return schemaRegistryBasicAuthUserInfo.get();
    }

    public StringProperty schemaRegistryBasicAuthUserInfoProperty() {
        return schemaRegistryBasicAuthUserInfo;
    }

    public void setSchemaRegistryBasicAuthUserInfo(String schemaRegistryBasicAuthUserInfo) {
        this.schemaRegistryBasicAuthUserInfo.set(schemaRegistryBasicAuthUserInfo);
    }

    @JsonProperty("schemaRegistryUseSsl")
    public boolean isSchemaRegistryUseSsl() {
        return schemaRegistryUseSsl.get();
    }

    public BooleanProperty schemaRegistryUseSslProperty() {
        return schemaRegistryUseSsl;
    }

    public void setSchemaRegistryUseSsl(boolean schemaRegistryUseSsl) {
        this.schemaRegistryUseSsl.set(schemaRegistryUseSsl);
    }

    @JsonProperty("kafkaConnectUrl")
    public String getkafkaConnectUrl() {
        return kafkaConnectUrl.get();
    }

    public StringProperty kafkaConnectUrlProperty() {
        return kafkaConnectUrl;
    }

    public void setkafkaConnectUrl(String kafkaConnectUrl) {
        this.kafkaConnectUrl.set(kafkaConnectUrl);
    }

    @JsonProperty("kafkaConnectBasicAuthUser")
    public String getkafkaConnectBasicAuthUser() {
        return kafkaConnectBasicAuthUser.get();
    }

    public StringProperty kafkaConnectBasicAuthUserProperty() {
        return kafkaConnectBasicAuthUser;
    }

    public void setkafkaConnectBasicAuthUser(String kafkaConnectBasicAuthUser) {
        this.kafkaConnectBasicAuthUser.set(kafkaConnectBasicAuthUser);
    }

    @JsonProperty("kafkaConnectBasicAuthPassword")
    public String getkafkaConnectBasicAuthPassword() {
        return kafkaConnectBasicAuthPassword.get();
    }

    public StringProperty kafkaConnectBasicAuthPasswordProperty() {
        return kafkaConnectBasicAuthPassword;
    }

    public void setkafkaConnectBasicAuthPassword(String kafkaConnectBasicAuthPassword) {
        this.kafkaConnectBasicAuthPassword.set(kafkaConnectBasicAuthPassword);
    }

    @JsonProperty("kafkaConnectUseSsl")
    public boolean isKafkaConnectuseSsl() {
        return kafkaConnectuseSsl.get();
    }

    public BooleanProperty kafkaConnectuseSslProperty() {
        return kafkaConnectuseSsl;
    }

    public void setKafkaConnectuseSsl(boolean kafkaConnectuseSsl) {
        this.kafkaConnectuseSsl.set(kafkaConnectuseSsl);
    }

    @JsonIgnore
    public boolean isSchemaRegistryHttps() {
        if (schemaRegistry.get() == null) {
            return false;
        }
        return schemaRegistry.get().toLowerCase().startsWith("https:");
    }


    @JsonIgnore
    public boolean isKafkaConnectHttps() {
        if (kafkaConnectUrl.get() == null) {
            return false;
        }
        return kafkaConnectUrl.get().toLowerCase().startsWith("https:");
    }


    @JsonProperty("suppressSslEndPointIdentification")
    public boolean issuppressSslEndPointIdentification() {
        return suppressSslEndPointIdentification.get();
    }

    public BooleanProperty suppressSslEndPointIdentificationProperty() {
        return suppressSslEndPointIdentification;
    }

    public void setsuppressSslEndPointIdentification(boolean suppressSslEndPointIdentification) {
        this.suppressSslEndPointIdentification.set(suppressSslEndPointIdentification);
    }


    @Override
    public String toString() {
        return String.format("%s (%s)", getIdentifier(), getBootStrapServers());
    }

}
