
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.derun.webservice.client.taxmonitor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TaxPayQueryReqInfoUserName_QNAME = new QName("http://beans.derun.com", "userName");
    private final static QName _TaxPayQueryReqInfoVehicleInfo_QNAME = new QName("http://beans.derun.com", "vehicleInfo");
    private final static QName _TaxPayQueryReqInfoPassword_QNAME = new QName("http://beans.derun.com", "password");
    private final static QName _BaseConfirmReqInfoCarMatchId_QNAME = new QName("http://beans.derun.com", "carMatchId");
    private final static QName _BaseConfirmReqInfoTaxConfirmNo_QNAME = new QName("http://beans.derun.com", "taxConfirmNo");
    private final static QName _BaseConfirmReqInfoCityCode_QNAME = new QName("http://beans.derun.com", "cityCode");
    private final static QName _BaseConfirmReqInfoCountryCode_QNAME = new QName("http://beans.derun.com", "countryCode");
    private final static QName _BaseConfirmReqInfoINSURECONFORMFLAG_QNAME = new QName("http://beans.derun.com", "INSURE_CONFORM_FLAG");
    private final static QName _BaseConfirmReqInfoCompanyCode_QNAME = new QName("http://beans.derun.com", "companyCode");
    private final static QName _BaseConfirmReqInfoCarSerialNo_QNAME = new QName("http://beans.derun.com", "carSerialNo");
    private final static QName _BaseConfirmReqInfoTaxQueryNo_QNAME = new QName("http://beans.derun.com", "taxQueryNo");
    private final static QName _BaseConfirmReqInfoVehicleOwnerInfo_QNAME = new QName("http://beans.derun.com", "vehicleOwnerInfo");
    private final static QName _BaseConfirmReqInfoCalcTaxFlag_QNAME = new QName("http://beans.derun.com", "calcTaxFlag");
    private final static QName _BaseConfirmReqInfoAreaCode_QNAME = new QName("http://beans.derun.com", "areaCode");
    private final static QName _BaseConfirmReqInfoTaxPrintNo_QNAME = new QName("http://beans.derun.com", "taxPrintNo");
    private final static QName _BaseConfirmReqInfoTaxInfo_QNAME = new QName("http://beans.derun.com", "taxInfo");
    private final static QName _BaseQueryReqInfoQuerySequencetTime_QNAME = new QName("http://beans.derun.com", "querySequencetTime");
    private final static QName _TaxAmountTypeTaxDealCode_QNAME = new QName("http://beans.derun.com", "taxDealCode");
    private final static QName _TaxAmountTypeTaxAmountFlag_QNAME = new QName("http://beans.derun.com", "taxAmount_Flag");
    private final static QName _DBInfoLockedSql_QNAME = new QName("http://vo.taxmonitor.derun.com", "lockedSql");
    private final static QName _DBInfoBanner_QNAME = new QName("http://vo.taxmonitor.derun.com", "banner");
    private final static QName _DBInfoRunningSql_QNAME = new QName("http://vo.taxmonitor.derun.com", "runningSql");
    private final static QName _DBInfoUserConn_QNAME = new QName("http://vo.taxmonitor.derun.com", "userConn");
    private final static QName _DBInfoTsInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "tsInfo");
    private final static QName _BaseMonitorResInfoBusiMonInfo_QNAME = new QName("http://beans.derun.com", "busiMonInfo");
    private final static QName _BaseMonitorResInfoSysMonInfo_QNAME = new QName("http://beans.derun.com", "sysMonInfo");
    private final static QName _TaxTypePayDate_QNAME = new QName("http://beans.derun.com", "payDate");
    private final static QName _TaxTypeTaxPayerName_QNAME = new QName("http://beans.derun.com", "taxPayerName");
    private final static QName _TaxTypeCurrentTaxDue_QNAME = new QName("http://beans.derun.com", "currentTaxDue");
    private final static QName _TaxTypeTaxPayerIdentificationCode_QNAME = new QName("http://beans.derun.com", "taxPayerIdentificationCode");
    private final static QName _TaxTypeTaxTermTypeCode_QNAME = new QName("http://beans.derun.com", "taxTermTypeCode");
    private final static QName _TaxTypeTaxConditionCode_QNAME = new QName("http://beans.derun.com", "taxConditionCode");
    private final static QName _TaxTypeTaxRegistryNumber_QNAME = new QName("http://beans.derun.com", "taxRegistryNumber");
    private final static QName _TaxTypeTaxAmount_QNAME = new QName("http://beans.derun.com", "taxAmount");
    private final static QName _TaxTypePayCompanyCode_QNAME = new QName("http://beans.derun.com", "payCompanyCode");
    private final static QName _TaxTypeDelinquentTaxDue_QNAME = new QName("http://beans.derun.com", "delinquentTaxDue");
    private final static QName _TaxDealCodeTypeTaxDealCodeType_QNAME = new QName("http://beans.derun.com", "taxDealCode_Type");
    private final static QName _VehicleTypeSpecialCarType_QNAME = new QName("http://beans.derun.com", "specialCarType");
    private final static QName _VehicleTypeModel_QNAME = new QName("http://beans.derun.com", "model");
    private final static QName _VehicleTypeMotorUsageTypeCode_QNAME = new QName("http://beans.derun.com", "motorUsageTypeCode");
    private final static QName _VehicleTypeVIN_QNAME = new QName("http://beans.derun.com", "VIN");
    private final static QName _VehicleTypeFirstRegisterDate_QNAME = new QName("http://beans.derun.com", "firstRegisterDate");
    private final static QName _VehicleTypeMadeFactory_QNAME = new QName("http://beans.derun.com", "madeFactory");
    private final static QName _VehicleTypeNoLicenseFlag_QNAME = new QName("http://beans.derun.com", "noLicenseFlag");
    private final static QName _VehicleTypeLicensePlateType_QNAME = new QName("http://beans.derun.com", "licensePlateType");
    private final static QName _VehicleTypeVehicleType_QNAME = new QName("http://beans.derun.com", "vehicleType");
    private final static QName _VehicleTypeMotorTypeCode_QNAME = new QName("http://beans.derun.com", "motorTypeCode");
    private final static QName _VehicleTypeEngineNo_QNAME = new QName("http://beans.derun.com", "engineNo");
    private final static QName _VehicleTypeLicensePlateNo_QNAME = new QName("http://beans.derun.com", "licensePlateNo");
    private final static QName _VehicleTypeFuelType_QNAME = new QName("http://beans.derun.com", "fuelType");
    private final static QName _ProcessInfoUser_QNAME = new QName("http://vo.taxmonitor.derun.com", "user");
    private final static QName _ProcessInfoMemhare_QNAME = new QName("http://vo.taxmonitor.derun.com", "memhare");
    private final static QName _ProcessInfoCpuTime_QNAME = new QName("http://vo.taxmonitor.derun.com", "cpuTime");
    private final static QName _ProcessInfoState_QNAME = new QName("http://vo.taxmonitor.derun.com", "state");
    private final static QName _ProcessInfoMemUse_QNAME = new QName("http://vo.taxmonitor.derun.com", "memUse");
    private final static QName _ProcessInfoPid_QNAME = new QName("http://vo.taxmonitor.derun.com", "pid");
    private final static QName _ProcessInfoName_QNAME = new QName("http://vo.taxmonitor.derun.com", "name");
    private final static QName _ProcessInfoMemSize_QNAME = new QName("http://vo.taxmonitor.derun.com", "memSize");
    private final static QName _ProcessInfoStartTime_QNAME = new QName("http://vo.taxmonitor.derun.com", "startTime");
    private final static QName _BaseChangeQueryReqInfoChangeType_QNAME = new QName("http://beans.derun.com", "changeType");
    private final static QName _DerateTypeTaxDepartment_QNAME = new QName("http://beans.derun.com", "taxDepartment");
    private final static QName _DerateTypeDeductionDueType_QNAME = new QName("http://beans.derun.com", "deductionDueType");
    private final static QName _DerateTypeTaxDepartmentCode_QNAME = new QName("http://beans.derun.com", "taxDepartmentCode");
    private final static QName _DerateTypeDeductionDueCode_QNAME = new QName("http://beans.derun.com", "deductionDueCode");
    private final static QName _DerateTypeDeductionDocumentNumber_QNAME = new QName("http://beans.derun.com", "deductionDocumentNumber");
    private final static QName _PaidTypeTaxDocumentNumber_QNAME = new QName("http://beans.derun.com", "taxDocumentNumber");
    private final static QName _BaseMonitorReqInfoMonType_QNAME = new QName("http://beans.derun.com", "monType");
    private final static QName _CpuInfoClockSpeed_QNAME = new QName("http://vo.taxmonitor.derun.com", "clockSpeed");
    private final static QName _CpuInfoTotalPercent_QNAME = new QName("http://vo.taxmonitor.derun.com", "totalPercent");
    private final static QName _CpuInfoModel_QNAME = new QName("http://vo.taxmonitor.derun.com", "model");
    private final static QName _ReconciliationReqInfoCheckingType_QNAME = new QName("http://beans.derun.com", "checkingType");
    private final static QName _BusiMonInfoTaxPayQueryReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "taxPayQueryReqInfo");
    private final static QName _BusiMonInfoServiceType_QNAME = new QName("http://vo.taxmonitor.derun.com", "serviceType");
    private final static QName _BusiMonInfoBaseChangeConfirmReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "baseChangeConfirmReqInfo");
    private final static QName _BusiMonInfoBaseChangeQueryReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "baseChangeQueryReqInfo");
    private final static QName _BusiMonInfoBaseQueryReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "baseQueryReqInfo");
    private final static QName _BusiMonInfoBaseConfirmReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "baseConfirmReqInfo");
    private final static QName _BusiMonInfoDeclareDateUploadReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "declareDateUploadReqInfo");
    private final static QName _BusiMonInfoDealTime_QNAME = new QName("http://vo.taxmonitor.derun.com", "dealTime");
    private final static QName _BusiMonInfoReconciliationReqInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "reconciliationReqInfo");
    private final static QName _BaseChangeConfirmReqInfoChangeQueryNo_QNAME = new QName("http://beans.derun.com", "changeQueryNo");
    private final static QName _BaseChangeConfirmReqInfoChangeConfirmNo_QNAME = new QName("http://beans.derun.com", "changeConfirmNo");
    private final static QName _AnnualTaxTypeExceedDate_QNAME = new QName("http://beans.derun.com", "exceedDate");
    private final static QName _AnnualTaxTypeTaxEndDate_QNAME = new QName("http://beans.derun.com", "taxEndDate");
    private final static QName _AnnualTaxTypeDerate_QNAME = new QName("http://beans.derun.com", "derate");
    private final static QName _AnnualTaxTypeTaxUnitTypeCode_QNAME = new QName("http://beans.derun.com", "taxUnitTypeCode");
    private final static QName _AnnualTaxTypePaid_QNAME = new QName("http://beans.derun.com", "paid");
    private final static QName _AnnualTaxTypeTaxStartDate_QNAME = new QName("http://beans.derun.com", "taxStartDate");
    private final static QName _AnnualTaxTypeTaxLocationCode_QNAME = new QName("http://beans.derun.com", "taxLocationCode");
    private final static QName _VehicleOwnerTypeVehicleOwnerName_QNAME = new QName("http://beans.derun.com", "vehicleOwnerName");
    private final static QName _VehicleOwnerTypeCredentialCode_QNAME = new QName("http://beans.derun.com", "credentialCode");
    private final static QName _VehicleOwnerTypeCredentialNo_QNAME = new QName("http://beans.derun.com", "credentialNo");
    private final static QName _VehicleOwnerTypePhoneNo_QNAME = new QName("http://beans.derun.com", "phoneNo");
    private final static QName _VehicleOwnerTypeAddress_QNAME = new QName("http://beans.derun.com", "address");
    private final static QName _MemInfoFreeMem_QNAME = new QName("http://vo.taxmonitor.derun.com", "freeMem");
    private final static QName _MemInfoJvmTotalMem_QNAME = new QName("http://vo.taxmonitor.derun.com", "jvmTotalMem");
    private final static QName _MemInfoJvmFreeMem_QNAME = new QName("http://vo.taxmonitor.derun.com", "jvmFreeMem");
    private final static QName _MemInfoTotalMem_QNAME = new QName("http://vo.taxmonitor.derun.com", "totalMem");
    private final static QName _MemInfoJvmMaxMem_QNAME = new QName("http://vo.taxmonitor.derun.com", "jvmMaxMem");
    private final static QName _DiskInfoDevName_QNAME = new QName("http://vo.taxmonitor.derun.com", "devName");
    private final static QName _DiskInfoUserPercent_QNAME = new QName("http://vo.taxmonitor.derun.com", "userPercent");
    private final static QName _DiskInfoTotalC_QNAME = new QName("http://vo.taxmonitor.derun.com", "totalC");
    private final static QName _DiskInfoFree_QNAME = new QName("http://vo.taxmonitor.derun.com", "free");
    private final static QName _SysMonInfoNetInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "netInfo");
    private final static QName _SysMonInfoDiskInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "diskInfo");
    private final static QName _SysMonInfoDbInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "dbInfo");
    private final static QName _SysMonInfoProcessInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "processInfo");
    private final static QName _SysMonInfoMemInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "memInfo");
    private final static QName _SysMonInfoCpuInfo_QNAME = new QName("http://vo.taxmonitor.derun.com", "cpuInfo");
    private final static QName _NetInfoIp_QNAME = new QName("http://vo.taxmonitor.derun.com", "ip");
    private final static QName _DeclareDateUploadReqInfoDeclareDate_QNAME = new QName("http://beans.derun.com", "declareDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.derun.webservice.client.taxmonitor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusiMonInfo }
     * 
     */
    public BusiMonInfo createBusiMonInfo() {
        return new BusiMonInfo();
    }

    /**
     * Create an instance of {@link DiskInfo }
     * 
     */
    public DiskInfo createDiskInfo() {
        return new DiskInfo();
    }

    /**
     * Create an instance of {@link CpuInfo }
     * 
     */
    public CpuInfo createCpuInfo() {
        return new CpuInfo();
    }

    /**
     * Create an instance of {@link MemInfo }
     * 
     */
    public MemInfo createMemInfo() {
        return new MemInfo();
    }

    /**
     * Create an instance of {@link ArrayOfNetInfo }
     * 
     */
    public ArrayOfNetInfo createArrayOfNetInfo() {
        return new ArrayOfNetInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDiskInfo }
     * 
     */
    public ArrayOfDiskInfo createArrayOfDiskInfo() {
        return new ArrayOfDiskInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCpuInfo }
     * 
     */
    public ArrayOfCpuInfo createArrayOfCpuInfo() {
        return new ArrayOfCpuInfo();
    }

    /**
     * Create an instance of {@link DBInfo }
     * 
     */
    public DBInfo createDBInfo() {
        return new DBInfo();
    }

    /**
     * Create an instance of {@link ArrayOfBusiMonInfo }
     * 
     */
    public ArrayOfBusiMonInfo createArrayOfBusiMonInfo() {
        return new ArrayOfBusiMonInfo();
    }

    /**
     * Create an instance of {@link SysMonInfo }
     * 
     */
    public SysMonInfo createSysMonInfo() {
        return new SysMonInfo();
    }

    /**
     * Create an instance of {@link ProcessInfo }
     * 
     */
    public ProcessInfo createProcessInfo() {
        return new ProcessInfo();
    }

    /**
     * Create an instance of {@link NetInfo }
     * 
     */
    public NetInfo createNetInfo() {
        return new NetInfo();
    }

    /**
     * Create an instance of {@link ArrayOfProcessInfo }
     * 
     */
    public ArrayOfProcessInfo createArrayOfProcessInfo() {
        return new ArrayOfProcessInfo();
    }

    /**
     * Create an instance of {@link TaxMonResponse }
     * 
     */
    public TaxMonResponse createTaxMonResponse() {
        return new TaxMonResponse();
    }

    /**
     * Create an instance of {@link BaseMonitorResInfo }
     * 
     */
    public BaseMonitorResInfo createBaseMonitorResInfo() {
        return new BaseMonitorResInfo();
    }

    /**
     * Create an instance of {@link TaxMon }
     * 
     */
    public TaxMon createTaxMon() {
        return new TaxMon();
    }

    /**
     * Create an instance of {@link BaseMonitorReqInfo }
     * 
     */
    public BaseMonitorReqInfo createBaseMonitorReqInfo() {
        return new BaseMonitorReqInfo();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfString }
     * 
     */
    public ArrayOfArrayOfString createArrayOfArrayOfString() {
        return new ArrayOfArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link DeclareDateUploadReqInfo }
     * 
     */
    public DeclareDateUploadReqInfo createDeclareDateUploadReqInfo() {
        return new DeclareDateUploadReqInfo();
    }

    /**
     * Create an instance of {@link TaxAmountType }
     * 
     */
    public TaxAmountType createTaxAmountType() {
        return new TaxAmountType();
    }

    /**
     * Create an instance of {@link BaseConfirmReqInfo }
     * 
     */
    public BaseConfirmReqInfo createBaseConfirmReqInfo() {
        return new BaseConfirmReqInfo();
    }

    /**
     * Create an instance of {@link TaxDealCodeType }
     * 
     */
    public TaxDealCodeType createTaxDealCodeType() {
        return new TaxDealCodeType();
    }

    /**
     * Create an instance of {@link BaseChangeQueryReqInfo }
     * 
     */
    public BaseChangeQueryReqInfo createBaseChangeQueryReqInfo() {
        return new BaseChangeQueryReqInfo();
    }

    /**
     * Create an instance of {@link BaseQueryReqInfo }
     * 
     */
    public BaseQueryReqInfo createBaseQueryReqInfo() {
        return new BaseQueryReqInfo();
    }

    /**
     * Create an instance of {@link AnnualTaxType }
     * 
     */
    public AnnualTaxType createAnnualTaxType() {
        return new AnnualTaxType();
    }

    /**
     * Create an instance of {@link PaidType }
     * 
     */
    public PaidType createPaidType() {
        return new PaidType();
    }

    /**
     * Create an instance of {@link VehicleOwnerType }
     * 
     */
    public VehicleOwnerType createVehicleOwnerType() {
        return new VehicleOwnerType();
    }

    /**
     * Create an instance of {@link ArrayOfAnnualTaxType }
     * 
     */
    public ArrayOfAnnualTaxType createArrayOfAnnualTaxType() {
        return new ArrayOfAnnualTaxType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link TaxPayQueryReqInfo }
     * 
     */
    public TaxPayQueryReqInfo createTaxPayQueryReqInfo() {
        return new TaxPayQueryReqInfo();
    }

    /**
     * Create an instance of {@link ReconciliationReqInfo }
     * 
     */
    public ReconciliationReqInfo createReconciliationReqInfo() {
        return new ReconciliationReqInfo();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link ArrayOfTaxDealCodeType }
     * 
     */
    public ArrayOfTaxDealCodeType createArrayOfTaxDealCodeType() {
        return new ArrayOfTaxDealCodeType();
    }

    /**
     * Create an instance of {@link DerateType }
     * 
     */
    public DerateType createDerateType() {
        return new DerateType();
    }

    /**
     * Create an instance of {@link BaseChangeConfirmReqInfo }
     * 
     */
    public BaseChangeConfirmReqInfo createBaseChangeConfirmReqInfo() {
        return new BaseChangeConfirmReqInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = TaxPayQueryReqInfo.class)
    public JAXBElement<String> createTaxPayQueryReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, TaxPayQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleInfo", scope = TaxPayQueryReqInfo.class)
    public JAXBElement<VehicleType> createTaxPayQueryReqInfoVehicleInfo(VehicleType value) {
        return new JAXBElement<VehicleType>(_TaxPayQueryReqInfoVehicleInfo_QNAME, VehicleType.class, TaxPayQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = TaxPayQueryReqInfo.class)
    public JAXBElement<String> createTaxPayQueryReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, TaxPayQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "carMatchId", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoCarMatchId(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCarMatchId_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxConfirmNo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseConfirmReqInfoTaxConfirmNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseConfirmReqInfoTaxConfirmNo_QNAME, TaxDealCodeType.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "cityCode", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoCityCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCityCode_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "countryCode", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoCountryCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCountryCode_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "INSURE_CONFORM_FLAG", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoINSURECONFORMFLAG(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoINSURECONFORMFLAG_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "companyCode", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoCompanyCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCompanyCode_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleInfo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<VehicleType> createBaseConfirmReqInfoVehicleInfo(VehicleType value) {
        return new JAXBElement<VehicleType>(_TaxPayQueryReqInfoVehicleInfo_QNAME, VehicleType.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "carSerialNo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoCarSerialNo(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCarSerialNo_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxQueryNo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseConfirmReqInfoTaxQueryNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseConfirmReqInfoTaxQueryNo_QNAME, TaxDealCodeType.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOwnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleOwnerInfo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<VehicleOwnerType> createBaseConfirmReqInfoVehicleOwnerInfo(VehicleOwnerType value) {
        return new JAXBElement<VehicleOwnerType>(_BaseConfirmReqInfoVehicleOwnerInfo_QNAME, VehicleOwnerType.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "calcTaxFlag", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoCalcTaxFlag(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCalcTaxFlag_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "areaCode", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoAreaCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoAreaCode_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxPrintNo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseConfirmReqInfoTaxPrintNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseConfirmReqInfoTaxPrintNo_QNAME, TaxDealCodeType.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = BaseConfirmReqInfo.class)
    public JAXBElement<String> createBaseConfirmReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxInfo", scope = BaseConfirmReqInfo.class)
    public JAXBElement<TaxType> createBaseConfirmReqInfoTaxInfo(TaxType value) {
        return new JAXBElement<TaxType>(_BaseConfirmReqInfoTaxInfo_QNAME, TaxType.class, BaseConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "carMatchId", scope = BaseQueryReqInfo.class)
    public JAXBElement<String> createBaseQueryReqInfoCarMatchId(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCarMatchId_QNAME, String.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = BaseQueryReqInfo.class)
    public JAXBElement<String> createBaseQueryReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "querySequencetTime", scope = BaseQueryReqInfo.class)
    public JAXBElement<String> createBaseQueryReqInfoQuerySequencetTime(String value) {
        return new JAXBElement<String>(_BaseQueryReqInfoQuerySequencetTime_QNAME, String.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "companyCode", scope = BaseQueryReqInfo.class)
    public JAXBElement<String> createBaseQueryReqInfoCompanyCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCompanyCode_QNAME, String.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleInfo", scope = BaseQueryReqInfo.class)
    public JAXBElement<VehicleType> createBaseQueryReqInfoVehicleInfo(VehicleType value) {
        return new JAXBElement<VehicleType>(_TaxPayQueryReqInfoVehicleInfo_QNAME, VehicleType.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = BaseQueryReqInfo.class)
    public JAXBElement<String> createBaseQueryReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxInfo", scope = BaseQueryReqInfo.class)
    public JAXBElement<TaxType> createBaseQueryReqInfoTaxInfo(TaxType value) {
        return new JAXBElement<TaxType>(_BaseConfirmReqInfoTaxInfo_QNAME, TaxType.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "areaCode", scope = BaseQueryReqInfo.class)
    public JAXBElement<String> createBaseQueryReqInfoAreaCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoAreaCode_QNAME, String.class, BaseQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDealCode", scope = TaxAmountType.class)
    public JAXBElement<TaxDealCodeType> createTaxAmountTypeTaxDealCode(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_TaxAmountTypeTaxDealCode_QNAME, TaxDealCodeType.class, TaxAmountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxAmount_Flag", scope = TaxAmountType.class)
    public JAXBElement<String> createTaxAmountTypeTaxAmountFlag(String value) {
        return new JAXBElement<String>(_TaxAmountTypeTaxAmountFlag_QNAME, String.class, TaxAmountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "lockedSql", scope = DBInfo.class)
    public JAXBElement<ArrayOfArrayOfString> createDBInfoLockedSql(ArrayOfArrayOfString value) {
        return new JAXBElement<ArrayOfArrayOfString>(_DBInfoLockedSql_QNAME, ArrayOfArrayOfString.class, DBInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "banner", scope = DBInfo.class)
    public JAXBElement<String> createDBInfoBanner(String value) {
        return new JAXBElement<String>(_DBInfoBanner_QNAME, String.class, DBInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "runningSql", scope = DBInfo.class)
    public JAXBElement<ArrayOfArrayOfString> createDBInfoRunningSql(ArrayOfArrayOfString value) {
        return new JAXBElement<ArrayOfArrayOfString>(_DBInfoRunningSql_QNAME, ArrayOfArrayOfString.class, DBInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "userConn", scope = DBInfo.class)
    public JAXBElement<ArrayOfArrayOfString> createDBInfoUserConn(ArrayOfArrayOfString value) {
        return new JAXBElement<ArrayOfArrayOfString>(_DBInfoUserConn_QNAME, ArrayOfArrayOfString.class, DBInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "tsInfo", scope = DBInfo.class)
    public JAXBElement<ArrayOfArrayOfString> createDBInfoTsInfo(ArrayOfArrayOfString value) {
        return new JAXBElement<ArrayOfArrayOfString>(_DBInfoTsInfo_QNAME, ArrayOfArrayOfString.class, DBInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusiMonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "busiMonInfo", scope = BaseMonitorResInfo.class)
    public JAXBElement<ArrayOfBusiMonInfo> createBaseMonitorResInfoBusiMonInfo(ArrayOfBusiMonInfo value) {
        return new JAXBElement<ArrayOfBusiMonInfo>(_BaseMonitorResInfoBusiMonInfo_QNAME, ArrayOfBusiMonInfo.class, BaseMonitorResInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SysMonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "sysMonInfo", scope = BaseMonitorResInfo.class)
    public JAXBElement<SysMonInfo> createBaseMonitorResInfoSysMonInfo(SysMonInfo value) {
        return new JAXBElement<SysMonInfo>(_BaseMonitorResInfoSysMonInfo_QNAME, SysMonInfo.class, BaseMonitorResInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "payDate", scope = TaxType.class)
    public JAXBElement<String> createTaxTypePayDate(String value) {
        return new JAXBElement<String>(_TaxTypePayDate_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxPayerName", scope = TaxType.class)
    public JAXBElement<String> createTaxTypeTaxPayerName(String value) {
        return new JAXBElement<String>(_TaxTypeTaxPayerName_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnualTaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "currentTaxDue", scope = TaxType.class)
    public JAXBElement<AnnualTaxType> createTaxTypeCurrentTaxDue(AnnualTaxType value) {
        return new JAXBElement<AnnualTaxType>(_TaxTypeCurrentTaxDue_QNAME, AnnualTaxType.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxPayerIdentificationCode", scope = TaxType.class)
    public JAXBElement<String> createTaxTypeTaxPayerIdentificationCode(String value) {
        return new JAXBElement<String>(_TaxTypeTaxPayerIdentificationCode_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxTermTypeCode", scope = TaxType.class)
    public JAXBElement<String> createTaxTypeTaxTermTypeCode(String value) {
        return new JAXBElement<String>(_TaxTypeTaxTermTypeCode_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxConditionCode", scope = TaxType.class)
    public JAXBElement<String> createTaxTypeTaxConditionCode(String value) {
        return new JAXBElement<String>(_TaxTypeTaxConditionCode_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxRegistryNumber", scope = TaxType.class)
    public JAXBElement<String> createTaxTypeTaxRegistryNumber(String value) {
        return new JAXBElement<String>(_TaxTypeTaxRegistryNumber_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxAmount", scope = TaxType.class)
    public JAXBElement<TaxAmountType> createTaxTypeTaxAmount(TaxAmountType value) {
        return new JAXBElement<TaxAmountType>(_TaxTypeTaxAmount_QNAME, TaxAmountType.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "payCompanyCode", scope = TaxType.class)
    public JAXBElement<String> createTaxTypePayCompanyCode(String value) {
        return new JAXBElement<String>(_TaxTypePayCompanyCode_QNAME, String.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnnualTaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "delinquentTaxDue", scope = TaxType.class)
    public JAXBElement<ArrayOfAnnualTaxType> createTaxTypeDelinquentTaxDue(ArrayOfAnnualTaxType value) {
        return new JAXBElement<ArrayOfAnnualTaxType>(_TaxTypeDelinquentTaxDue_QNAME, ArrayOfAnnualTaxType.class, TaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDealCode_Type", scope = TaxDealCodeType.class)
    public JAXBElement<String> createTaxDealCodeTypeTaxDealCodeType(String value) {
        return new JAXBElement<String>(_TaxDealCodeTypeTaxDealCodeType_QNAME, String.class, TaxDealCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "specialCarType", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeSpecialCarType(String value) {
        return new JAXBElement<String>(_VehicleTypeSpecialCarType_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "model", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeModel(String value) {
        return new JAXBElement<String>(_VehicleTypeModel_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "motorUsageTypeCode", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeMotorUsageTypeCode(String value) {
        return new JAXBElement<String>(_VehicleTypeMotorUsageTypeCode_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "VIN", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeVIN(String value) {
        return new JAXBElement<String>(_VehicleTypeVIN_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "firstRegisterDate", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeFirstRegisterDate(String value) {
        return new JAXBElement<String>(_VehicleTypeFirstRegisterDate_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "madeFactory", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeMadeFactory(String value) {
        return new JAXBElement<String>(_VehicleTypeMadeFactory_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "noLicenseFlag", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeNoLicenseFlag(String value) {
        return new JAXBElement<String>(_VehicleTypeNoLicenseFlag_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "licensePlateType", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeLicensePlateType(String value) {
        return new JAXBElement<String>(_VehicleTypeLicensePlateType_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleType", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeVehicleType(String value) {
        return new JAXBElement<String>(_VehicleTypeVehicleType_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "motorTypeCode", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeMotorTypeCode(String value) {
        return new JAXBElement<String>(_VehicleTypeMotorTypeCode_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "engineNo", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeEngineNo(String value) {
        return new JAXBElement<String>(_VehicleTypeEngineNo_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "licensePlateNo", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeLicensePlateNo(String value) {
        return new JAXBElement<String>(_VehicleTypeLicensePlateNo_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "fuelType", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeFuelType(String value) {
        return new JAXBElement<String>(_VehicleTypeFuelType_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "user", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoUser(String value) {
        return new JAXBElement<String>(_ProcessInfoUser_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "memhare", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoMemhare(String value) {
        return new JAXBElement<String>(_ProcessInfoMemhare_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "cpuTime", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoCpuTime(String value) {
        return new JAXBElement<String>(_ProcessInfoCpuTime_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "state", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoState(String value) {
        return new JAXBElement<String>(_ProcessInfoState_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "memUse", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoMemUse(String value) {
        return new JAXBElement<String>(_ProcessInfoMemUse_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "pid", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoPid(String value) {
        return new JAXBElement<String>(_ProcessInfoPid_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "name", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoName(String value) {
        return new JAXBElement<String>(_ProcessInfoName_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "memSize", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoMemSize(String value) {
        return new JAXBElement<String>(_ProcessInfoMemSize_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "startTime", scope = ProcessInfo.class)
    public JAXBElement<String> createProcessInfoStartTime(String value) {
        return new JAXBElement<String>(_ProcessInfoStartTime_QNAME, String.class, ProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "carMatchId", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<String> createBaseChangeQueryReqInfoCarMatchId(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCarMatchId_QNAME, String.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxConfirmNo", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseChangeQueryReqInfoTaxConfirmNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseConfirmReqInfoTaxConfirmNo_QNAME, TaxDealCodeType.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<String> createBaseChangeQueryReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "companyCode", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<String> createBaseChangeQueryReqInfoCompanyCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCompanyCode_QNAME, String.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleInfo", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<VehicleType> createBaseChangeQueryReqInfoVehicleInfo(VehicleType value) {
        return new JAXBElement<VehicleType>(_TaxPayQueryReqInfoVehicleInfo_QNAME, VehicleType.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<String> createBaseChangeQueryReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxInfo", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<TaxType> createBaseChangeQueryReqInfoTaxInfo(TaxType value) {
        return new JAXBElement<TaxType>(_BaseConfirmReqInfoTaxInfo_QNAME, TaxType.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "changeType", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<String> createBaseChangeQueryReqInfoChangeType(String value) {
        return new JAXBElement<String>(_BaseChangeQueryReqInfoChangeType_QNAME, String.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOwnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleOwnerInfo", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<VehicleOwnerType> createBaseChangeQueryReqInfoVehicleOwnerInfo(VehicleOwnerType value) {
        return new JAXBElement<VehicleOwnerType>(_BaseConfirmReqInfoVehicleOwnerInfo_QNAME, VehicleOwnerType.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "areaCode", scope = BaseChangeQueryReqInfo.class)
    public JAXBElement<String> createBaseChangeQueryReqInfoAreaCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoAreaCode_QNAME, String.class, BaseChangeQueryReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDepartment", scope = DerateType.class)
    public JAXBElement<String> createDerateTypeTaxDepartment(String value) {
        return new JAXBElement<String>(_DerateTypeTaxDepartment_QNAME, String.class, DerateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "deductionDueType", scope = DerateType.class)
    public JAXBElement<String> createDerateTypeDeductionDueType(String value) {
        return new JAXBElement<String>(_DerateTypeDeductionDueType_QNAME, String.class, DerateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDepartmentCode", scope = DerateType.class)
    public JAXBElement<String> createDerateTypeTaxDepartmentCode(String value) {
        return new JAXBElement<String>(_DerateTypeTaxDepartmentCode_QNAME, String.class, DerateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "deductionDueCode", scope = DerateType.class)
    public JAXBElement<String> createDerateTypeDeductionDueCode(String value) {
        return new JAXBElement<String>(_DerateTypeDeductionDueCode_QNAME, String.class, DerateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "deductionDocumentNumber", scope = DerateType.class)
    public JAXBElement<String> createDerateTypeDeductionDocumentNumber(String value) {
        return new JAXBElement<String>(_DerateTypeDeductionDocumentNumber_QNAME, String.class, DerateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDepartment", scope = PaidType.class)
    public JAXBElement<String> createPaidTypeTaxDepartment(String value) {
        return new JAXBElement<String>(_DerateTypeTaxDepartment_QNAME, String.class, PaidType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDocumentNumber", scope = PaidType.class)
    public JAXBElement<String> createPaidTypeTaxDocumentNumber(String value) {
        return new JAXBElement<String>(_PaidTypeTaxDocumentNumber_QNAME, String.class, PaidType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxDepartmentCode", scope = PaidType.class)
    public JAXBElement<String> createPaidTypeTaxDepartmentCode(String value) {
        return new JAXBElement<String>(_DerateTypeTaxDepartmentCode_QNAME, String.class, PaidType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "monType", scope = BaseMonitorReqInfo.class)
    public JAXBElement<String> createBaseMonitorReqInfoMonType(String value) {
        return new JAXBElement<String>(_BaseMonitorReqInfoMonType_QNAME, String.class, BaseMonitorReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "clockSpeed", scope = CpuInfo.class)
    public JAXBElement<String> createCpuInfoClockSpeed(String value) {
        return new JAXBElement<String>(_CpuInfoClockSpeed_QNAME, String.class, CpuInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "totalPercent", scope = CpuInfo.class)
    public JAXBElement<String> createCpuInfoTotalPercent(String value) {
        return new JAXBElement<String>(_CpuInfoTotalPercent_QNAME, String.class, CpuInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "model", scope = CpuInfo.class)
    public JAXBElement<String> createCpuInfoModel(String value) {
        return new JAXBElement<String>(_CpuInfoModel_QNAME, String.class, CpuInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxConfirmNo", scope = ReconciliationReqInfo.class)
    public JAXBElement<ArrayOfTaxDealCodeType> createReconciliationReqInfoTaxConfirmNo(ArrayOfTaxDealCodeType value) {
        return new JAXBElement<ArrayOfTaxDealCodeType>(_BaseConfirmReqInfoTaxConfirmNo_QNAME, ArrayOfTaxDealCodeType.class, ReconciliationReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = ReconciliationReqInfo.class)
    public JAXBElement<String> createReconciliationReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, ReconciliationReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "checkingType", scope = ReconciliationReqInfo.class)
    public JAXBElement<String> createReconciliationReqInfoCheckingType(String value) {
        return new JAXBElement<String>(_ReconciliationReqInfoCheckingType_QNAME, String.class, ReconciliationReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "companyCode", scope = ReconciliationReqInfo.class)
    public JAXBElement<String> createReconciliationReqInfoCompanyCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCompanyCode_QNAME, String.class, ReconciliationReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = ReconciliationReqInfo.class)
    public JAXBElement<String> createReconciliationReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, ReconciliationReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "areaCode", scope = ReconciliationReqInfo.class)
    public JAXBElement<String> createReconciliationReqInfoAreaCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoAreaCode_QNAME, String.class, ReconciliationReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxPayQueryReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "taxPayQueryReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<TaxPayQueryReqInfo> createBusiMonInfoTaxPayQueryReqInfo(TaxPayQueryReqInfo value) {
        return new JAXBElement<TaxPayQueryReqInfo>(_BusiMonInfoTaxPayQueryReqInfo_QNAME, TaxPayQueryReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "serviceType", scope = BusiMonInfo.class)
    public JAXBElement<String> createBusiMonInfoServiceType(String value) {
        return new JAXBElement<String>(_BusiMonInfoServiceType_QNAME, String.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseChangeConfirmReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "baseChangeConfirmReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<BaseChangeConfirmReqInfo> createBusiMonInfoBaseChangeConfirmReqInfo(BaseChangeConfirmReqInfo value) {
        return new JAXBElement<BaseChangeConfirmReqInfo>(_BusiMonInfoBaseChangeConfirmReqInfo_QNAME, BaseChangeConfirmReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseChangeQueryReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "baseChangeQueryReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<BaseChangeQueryReqInfo> createBusiMonInfoBaseChangeQueryReqInfo(BaseChangeQueryReqInfo value) {
        return new JAXBElement<BaseChangeQueryReqInfo>(_BusiMonInfoBaseChangeQueryReqInfo_QNAME, BaseChangeQueryReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseQueryReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "baseQueryReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<BaseQueryReqInfo> createBusiMonInfoBaseQueryReqInfo(BaseQueryReqInfo value) {
        return new JAXBElement<BaseQueryReqInfo>(_BusiMonInfoBaseQueryReqInfo_QNAME, BaseQueryReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseConfirmReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "baseConfirmReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<BaseConfirmReqInfo> createBusiMonInfoBaseConfirmReqInfo(BaseConfirmReqInfo value) {
        return new JAXBElement<BaseConfirmReqInfo>(_BusiMonInfoBaseConfirmReqInfo_QNAME, BaseConfirmReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareDateUploadReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "declareDateUploadReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<DeclareDateUploadReqInfo> createBusiMonInfoDeclareDateUploadReqInfo(DeclareDateUploadReqInfo value) {
        return new JAXBElement<DeclareDateUploadReqInfo>(_BusiMonInfoDeclareDateUploadReqInfo_QNAME, DeclareDateUploadReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "dealTime", scope = BusiMonInfo.class)
    public JAXBElement<String> createBusiMonInfoDealTime(String value) {
        return new JAXBElement<String>(_BusiMonInfoDealTime_QNAME, String.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReconciliationReqInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "reconciliationReqInfo", scope = BusiMonInfo.class)
    public JAXBElement<ReconciliationReqInfo> createBusiMonInfoReconciliationReqInfo(ReconciliationReqInfo value) {
        return new JAXBElement<ReconciliationReqInfo>(_BusiMonInfoReconciliationReqInfo_QNAME, ReconciliationReqInfo.class, BusiMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "carMatchId", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoCarMatchId(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCarMatchId_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "INSURE_CONFORM_FLAG", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoINSURECONFORMFLAG(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoINSURECONFORMFLAG_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "companyCode", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoCompanyCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCompanyCode_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleInfo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<VehicleType> createBaseChangeConfirmReqInfoVehicleInfo(VehicleType value) {
        return new JAXBElement<VehicleType>(_TaxPayQueryReqInfoVehicleInfo_QNAME, VehicleType.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "carSerialNo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoCarSerialNo(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCarSerialNo_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOwnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleOwnerInfo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<VehicleOwnerType> createBaseChangeConfirmReqInfoVehicleOwnerInfo(VehicleOwnerType value) {
        return new JAXBElement<VehicleOwnerType>(_BaseConfirmReqInfoVehicleOwnerInfo_QNAME, VehicleOwnerType.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "calcTaxFlag", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoCalcTaxFlag(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCalcTaxFlag_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "changeQueryNo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseChangeConfirmReqInfoChangeQueryNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseChangeConfirmReqInfoChangeQueryNo_QNAME, TaxDealCodeType.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "areaCode", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoAreaCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoAreaCode_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxPrintNo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseChangeConfirmReqInfoTaxPrintNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseConfirmReqInfoTaxPrintNo_QNAME, TaxDealCodeType.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "changeConfirmNo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<TaxDealCodeType> createBaseChangeConfirmReqInfoChangeConfirmNo(TaxDealCodeType value) {
        return new JAXBElement<TaxDealCodeType>(_BaseChangeConfirmReqInfoChangeConfirmNo_QNAME, TaxDealCodeType.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxInfo", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<TaxType> createBaseChangeConfirmReqInfoTaxInfo(TaxType value) {
        return new JAXBElement<TaxType>(_BaseConfirmReqInfoTaxInfo_QNAME, TaxType.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "changeType", scope = BaseChangeConfirmReqInfo.class)
    public JAXBElement<String> createBaseChangeConfirmReqInfoChangeType(String value) {
        return new JAXBElement<String>(_BaseChangeQueryReqInfoChangeType_QNAME, String.class, BaseChangeConfirmReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "exceedDate", scope = AnnualTaxType.class)
    public JAXBElement<String> createAnnualTaxTypeExceedDate(String value) {
        return new JAXBElement<String>(_AnnualTaxTypeExceedDate_QNAME, String.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxEndDate", scope = AnnualTaxType.class)
    public JAXBElement<String> createAnnualTaxTypeTaxEndDate(String value) {
        return new JAXBElement<String>(_AnnualTaxTypeTaxEndDate_QNAME, String.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "derate", scope = AnnualTaxType.class)
    public JAXBElement<DerateType> createAnnualTaxTypeDerate(DerateType value) {
        return new JAXBElement<DerateType>(_AnnualTaxTypeDerate_QNAME, DerateType.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxUnitTypeCode", scope = AnnualTaxType.class)
    public JAXBElement<String> createAnnualTaxTypeTaxUnitTypeCode(String value) {
        return new JAXBElement<String>(_AnnualTaxTypeTaxUnitTypeCode_QNAME, String.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "paid", scope = AnnualTaxType.class)
    public JAXBElement<PaidType> createAnnualTaxTypePaid(PaidType value) {
        return new JAXBElement<PaidType>(_AnnualTaxTypePaid_QNAME, PaidType.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxStartDate", scope = AnnualTaxType.class)
    public JAXBElement<String> createAnnualTaxTypeTaxStartDate(String value) {
        return new JAXBElement<String>(_AnnualTaxTypeTaxStartDate_QNAME, String.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxLocationCode", scope = AnnualTaxType.class)
    public JAXBElement<String> createAnnualTaxTypeTaxLocationCode(String value) {
        return new JAXBElement<String>(_AnnualTaxTypeTaxLocationCode_QNAME, String.class, AnnualTaxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "vehicleOwnerName", scope = VehicleOwnerType.class)
    public JAXBElement<String> createVehicleOwnerTypeVehicleOwnerName(String value) {
        return new JAXBElement<String>(_VehicleOwnerTypeVehicleOwnerName_QNAME, String.class, VehicleOwnerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "credentialCode", scope = VehicleOwnerType.class)
    public JAXBElement<String> createVehicleOwnerTypeCredentialCode(String value) {
        return new JAXBElement<String>(_VehicleOwnerTypeCredentialCode_QNAME, String.class, VehicleOwnerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "credentialNo", scope = VehicleOwnerType.class)
    public JAXBElement<String> createVehicleOwnerTypeCredentialNo(String value) {
        return new JAXBElement<String>(_VehicleOwnerTypeCredentialNo_QNAME, String.class, VehicleOwnerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "phoneNo", scope = VehicleOwnerType.class)
    public JAXBElement<String> createVehicleOwnerTypePhoneNo(String value) {
        return new JAXBElement<String>(_VehicleOwnerTypePhoneNo_QNAME, String.class, VehicleOwnerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "address", scope = VehicleOwnerType.class)
    public JAXBElement<String> createVehicleOwnerTypeAddress(String value) {
        return new JAXBElement<String>(_VehicleOwnerTypeAddress_QNAME, String.class, VehicleOwnerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "freeMem", scope = MemInfo.class)
    public JAXBElement<String> createMemInfoFreeMem(String value) {
        return new JAXBElement<String>(_MemInfoFreeMem_QNAME, String.class, MemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "jvmTotalMem", scope = MemInfo.class)
    public JAXBElement<String> createMemInfoJvmTotalMem(String value) {
        return new JAXBElement<String>(_MemInfoJvmTotalMem_QNAME, String.class, MemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "jvmFreeMem", scope = MemInfo.class)
    public JAXBElement<String> createMemInfoJvmFreeMem(String value) {
        return new JAXBElement<String>(_MemInfoJvmFreeMem_QNAME, String.class, MemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "totalMem", scope = MemInfo.class)
    public JAXBElement<String> createMemInfoTotalMem(String value) {
        return new JAXBElement<String>(_MemInfoTotalMem_QNAME, String.class, MemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "jvmMaxMem", scope = MemInfo.class)
    public JAXBElement<String> createMemInfoJvmMaxMem(String value) {
        return new JAXBElement<String>(_MemInfoJvmMaxMem_QNAME, String.class, MemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "devName", scope = DiskInfo.class)
    public JAXBElement<String> createDiskInfoDevName(String value) {
        return new JAXBElement<String>(_DiskInfoDevName_QNAME, String.class, DiskInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "userPercent", scope = DiskInfo.class)
    public JAXBElement<String> createDiskInfoUserPercent(String value) {
        return new JAXBElement<String>(_DiskInfoUserPercent_QNAME, String.class, DiskInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "totalC", scope = DiskInfo.class)
    public JAXBElement<String> createDiskInfoTotalC(String value) {
        return new JAXBElement<String>(_DiskInfoTotalC_QNAME, String.class, DiskInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "free", scope = DiskInfo.class)
    public JAXBElement<String> createDiskInfoFree(String value) {
        return new JAXBElement<String>(_DiskInfoFree_QNAME, String.class, DiskInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "netInfo", scope = SysMonInfo.class)
    public JAXBElement<ArrayOfNetInfo> createSysMonInfoNetInfo(ArrayOfNetInfo value) {
        return new JAXBElement<ArrayOfNetInfo>(_SysMonInfoNetInfo_QNAME, ArrayOfNetInfo.class, SysMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiskInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "diskInfo", scope = SysMonInfo.class)
    public JAXBElement<ArrayOfDiskInfo> createSysMonInfoDiskInfo(ArrayOfDiskInfo value) {
        return new JAXBElement<ArrayOfDiskInfo>(_SysMonInfoDiskInfo_QNAME, ArrayOfDiskInfo.class, SysMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "dbInfo", scope = SysMonInfo.class)
    public JAXBElement<DBInfo> createSysMonInfoDbInfo(DBInfo value) {
        return new JAXBElement<DBInfo>(_SysMonInfoDbInfo_QNAME, DBInfo.class, SysMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "processInfo", scope = SysMonInfo.class)
    public JAXBElement<ArrayOfProcessInfo> createSysMonInfoProcessInfo(ArrayOfProcessInfo value) {
        return new JAXBElement<ArrayOfProcessInfo>(_SysMonInfoProcessInfo_QNAME, ArrayOfProcessInfo.class, SysMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "memInfo", scope = SysMonInfo.class)
    public JAXBElement<MemInfo> createSysMonInfoMemInfo(MemInfo value) {
        return new JAXBElement<MemInfo>(_SysMonInfoMemInfo_QNAME, MemInfo.class, SysMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCpuInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "cpuInfo", scope = SysMonInfo.class)
    public JAXBElement<ArrayOfCpuInfo> createSysMonInfoCpuInfo(ArrayOfCpuInfo value) {
        return new JAXBElement<ArrayOfCpuInfo>(_SysMonInfoCpuInfo_QNAME, ArrayOfCpuInfo.class, SysMonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "ip", scope = NetInfo.class)
    public JAXBElement<String> createNetInfoIp(String value) {
        return new JAXBElement<String>(_NetInfoIp_QNAME, String.class, NetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vo.taxmonitor.derun.com", name = "name", scope = NetInfo.class)
    public JAXBElement<String> createNetInfoName(String value) {
        return new JAXBElement<String>(_ProcessInfoName_QNAME, String.class, NetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxDealCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "taxConfirmNo", scope = DeclareDateUploadReqInfo.class)
    public JAXBElement<ArrayOfTaxDealCodeType> createDeclareDateUploadReqInfoTaxConfirmNo(ArrayOfTaxDealCodeType value) {
        return new JAXBElement<ArrayOfTaxDealCodeType>(_BaseConfirmReqInfoTaxConfirmNo_QNAME, ArrayOfTaxDealCodeType.class, DeclareDateUploadReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "userName", scope = DeclareDateUploadReqInfo.class)
    public JAXBElement<String> createDeclareDateUploadReqInfoUserName(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoUserName_QNAME, String.class, DeclareDateUploadReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "companyCode", scope = DeclareDateUploadReqInfo.class)
    public JAXBElement<String> createDeclareDateUploadReqInfoCompanyCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoCompanyCode_QNAME, String.class, DeclareDateUploadReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "password", scope = DeclareDateUploadReqInfo.class)
    public JAXBElement<String> createDeclareDateUploadReqInfoPassword(String value) {
        return new JAXBElement<String>(_TaxPayQueryReqInfoPassword_QNAME, String.class, DeclareDateUploadReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "declareDate", scope = DeclareDateUploadReqInfo.class)
    public JAXBElement<String> createDeclareDateUploadReqInfoDeclareDate(String value) {
        return new JAXBElement<String>(_DeclareDateUploadReqInfoDeclareDate_QNAME, String.class, DeclareDateUploadReqInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.derun.com", name = "areaCode", scope = DeclareDateUploadReqInfo.class)
    public JAXBElement<String> createDeclareDateUploadReqInfoAreaCode(String value) {
        return new JAXBElement<String>(_BaseConfirmReqInfoAreaCode_QNAME, String.class, DeclareDateUploadReqInfo.class, value);
    }

}
