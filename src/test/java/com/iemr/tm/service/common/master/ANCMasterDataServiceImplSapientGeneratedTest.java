package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.repo.masterrepo.anc.DevelopmentProblemsRepo;
import com.iemr.tm.repo.masterrepo.anc.SurgeryTypesRepo;
import com.iemr.tm.repo.masterrepo.anc.PersonalHabitTypeRepo;
import com.iemr.tm.repo.masterrepo.anc.FundalHeightRepo;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.data.masterdata.anc.AllergicReactionTypes;
import com.iemr.tm.data.masterdata.anc.ServiceFacilityMaster;
import com.iemr.tm.data.masterdata.anc.Gestation;
import com.iemr.tm.data.doctor.DrugDoseMaster;
import com.iemr.tm.repo.masterrepo.anc.ComorbidConditionRepo;
import com.iemr.tm.repo.masterrepo.doctor.InstituteRepo;
import com.iemr.tm.repo.masterrepo.anc.DeliveryTypeRepo;
import com.iemr.tm.data.masterdata.anc.FundalHeight;
import com.iemr.tm.repo.masterrepo.covid19.CovidSymptomsMasterRepo;
import com.iemr.tm.data.masterdata.anc.DiseaseType;
import com.iemr.tm.data.masterdata.anc.CounsellingType;
import com.iemr.tm.data.masterdata.anc.PregOutcome;
import com.iemr.tm.data.masterdata.doctor.ItemMaster;
import com.iemr.tm.data.masterdata.anc.OptionalVaccinations;
import com.iemr.tm.repo.masterrepo.anc.PregDurationRepo;
import com.iemr.tm.repo.masterrepo.anc.GrossMotorMilestoneRepo;
import com.iemr.tm.repo.masterrepo.pnc.NewbornHealthStatusRepo;
import com.iemr.tm.data.masterdata.doctor.V_DrugPrescription;
import com.iemr.tm.data.institution.Institute;
import com.iemr.tm.repo.masterrepo.anc.DeliveryPlaceRepo;
import com.iemr.tm.data.doctor.DrugDurationUnitMaster;
import com.iemr.tm.data.masterdata.anc.MenstrualCycleRange;
import com.iemr.tm.repo.masterrepo.anc.DiseaseTypeRepo;
import com.iemr.tm.data.labModule.ProcedureData;
import com.iemr.tm.repo.masterrepo.ncdCare.NCDCareTypeRepo;
import com.iemr.tm.data.masterdata.anc.JointTypes;
import com.iemr.tm.data.masterdata.doctor.M_Uom;
import com.iemr.tm.data.masterdata.anc.DeliveryPlace;
import com.iemr.tm.repo.masterrepo.anc.MenstrualCycleRangeRepo;
import com.iemr.tm.data.covid19.CovidContactHistoryMaster;
import com.iemr.tm.data.masterdata.anc.PersonalHabitType;
import com.iemr.tm.repo.masterrepo.anc.CompFeedsRepo;
import com.iemr.tm.data.masterdata.doctor.RouteOfAdmin;
import com.iemr.tm.data.masterdata.doctor.ItemFormMaster;
import com.iemr.tm.repo.doctor.DrugDurationUnitMasterRepo;
import com.iemr.tm.data.masterdata.anc.IllnessTypes;
import com.iemr.tm.data.masterdata.anc.Musculoskeletal;
import com.iemr.tm.repo.masterrepo.anc.ServiceFacilityMasterRepo;
import com.iemr.tm.data.masterdata.anc.BloodGroups;
import com.iemr.tm.data.foetalmonitor.FoetalMonitorTestMaster;
import com.iemr.tm.repo.doctor.DrugDoseMasterRepo;
import com.iemr.tm.repo.masterrepo.anc.MenstrualProblemRepo;
import com.iemr.tm.repo.masterrepo.doctor.ItemMasterRepo;
import com.iemr.tm.data.covid19.CovidSymptomsMaster;
import com.iemr.tm.data.masterdata.anc.ServiceMaster;
import com.iemr.tm.repo.masterrepo.doctor.V_DrugPrescriptionRepo;
import com.iemr.tm.data.masterdata.anc.DevelopmentProblems;
import com.iemr.tm.data.doctor.DrugFrequencyMaster;
import com.iemr.tm.data.masterdata.anc.GrossMotorMilestone;
import com.iemr.tm.repo.masterrepo.anc.JointTypesRepo;
import com.iemr.tm.data.doctor.ChiefComplaintMaster;
import com.iemr.tm.data.masterdata.anc.SurgeryTypes;

import java.util.ArrayList;

import com.iemr.tm.repo.masterrepo.anc.AllergicReactionTypesRepo;
import com.iemr.tm.repo.masterrepo.anc.IllnessTypesRepo;
import com.iemr.tm.data.masterdata.anc.CompFeeds;
import com.iemr.tm.repo.masterrepo.anc.GestationRepo;
import com.iemr.tm.data.masterdata.anc.MenstrualCycleStatus;
import com.iemr.tm.data.masterdata.pnc.NewbornHealthStatus;
import com.iemr.tm.repo.masterrepo.anc.CounsellingTypeRepo;
import com.iemr.tm.repo.doctor.ChiefComplaintMasterRepo;
import com.iemr.tm.data.masterdata.anc.PregDuration;
import com.iemr.tm.repo.masterrepo.anc.MenstrualCycleStatusRepo;
import com.iemr.tm.repo.doctor.DrugFrequencyMasterRepo;
import com.iemr.tm.repo.masterrepo.anc.ChildVaccinationsRepo;
import com.iemr.tm.repo.masterrepo.covid19.CovidContactHistoryMasterRepo;
import com.iemr.tm.repo.masterrepo.covid19.CovidRecommnedationMasterRepo;
import com.iemr.tm.repo.masterrepo.anc.BloodGroupsRepo;
import com.iemr.tm.repo.masterrepo.anc.ServiceMasterRepo;
import com.iemr.tm.data.masterdata.anc.MenstrualProblem;
import com.iemr.tm.repo.labModule.ProcedureRepo;
import com.iemr.tm.repo.masterrepo.anc.PregOutcomeRepo;
import com.iemr.tm.data.masterdata.ncdscreening.NCDScreeningCondition;
import com.iemr.tm.repo.masterrepo.anc.ComplicationTypesRepo;
import com.iemr.tm.repo.masterrepo.anc.OptionalVaccinationsRepo;
import com.iemr.tm.repo.masterrepo.anc.MusculoskeletalRepo;
import com.iemr.tm.data.masterdata.anc.ChildVaccinations;
import com.iemr.tm.data.masterdata.nurse.FamilyMemberType;
import com.iemr.tm.data.covid19.CovidRecommendationMaster;
import com.iemr.tm.data.masterdata.ncdcare.NCDCareType;
import com.iemr.tm.data.masterdata.anc.ComorbidCondition;
import com.iemr.tm.repo.masterrepo.doctor.ItemFormMasterRepo;
import com.iemr.tm.data.masterdata.anc.ComplicationTypes;
import com.iemr.tm.data.masterdata.anc.DeliveryType;
import com.iemr.tm.repo.foetalmonitor.FoetalMonitorTestsRepo;
import com.iemr.tm.repo.masterrepo.nurse.FamilyMemberMasterRepo;
import org.mockito.MockedStatic;
import com.iemr.tm.repo.login.MasterVanRepo;
import com.iemr.tm.repo.masterrepo.doctor.RouteOfAdminRepo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ANCMasterDataServiceImplSapientGeneratedTest {

    private final AllergicReactionTypesRepo allergicReactionTypesRepoMock = mock(AllergicReactionTypesRepo.class, "allergicReactionTypesRepo");

    private final BloodGroupsRepo bloodGroupsRepoMock = mock(BloodGroupsRepo.class, "bloodGroupsRepo");

    private final ChildVaccinationsRepo childVaccinationsRepoMock = mock(ChildVaccinationsRepo.class, "childVaccinationsRepo");

    private final DeliveryPlaceRepo deliveryPlaceRepoMock = mock(DeliveryPlaceRepo.class, "deliveryPlaceRepo");

    private final DeliveryTypeRepo deliveryTypeRepoMock = mock(DeliveryTypeRepo.class, "deliveryTypeRepo");

    private final DevelopmentProblemsRepo developmentProblemsRepoMock = mock(DevelopmentProblemsRepo.class, "developmentProblemsRepo");

    private final GestationRepo gestationRepoMock = mock(GestationRepo.class, "gestationRepo");

    private final IllnessTypesRepo illnessTypesRepoMock = mock(IllnessTypesRepo.class, "illnessTypesRepo");

    private final JointTypesRepo jointTypesRepoMock = mock(JointTypesRepo.class, "jointTypesRepo");

    private final MenstrualCycleRangeRepo menstrualCycleRangeRepoMock = mock(MenstrualCycleRangeRepo.class, "menstrualCycleRangeRepo");

    private final MenstrualCycleStatusRepo menstrualCycleStatusRepoMock = mock(MenstrualCycleStatusRepo.class, "menstrualCycleStatusRepo");

    private final MenstrualProblemRepo menstrualProblemRepoMock = mock(MenstrualProblemRepo.class, "menstrualProblemRepo");

    private final MusculoskeletalRepo musculoskeletalRepoMock = mock(MusculoskeletalRepo.class, "musculoskeletalRepo");

    private final PregDurationRepo pregDurationRepoMock = mock(PregDurationRepo.class, "pregDurationRepo");

    private final SurgeryTypesRepo surgeryTypesRepoMock = mock(SurgeryTypesRepo.class, "surgeryTypesRepo");

    private final ComorbidConditionRepo comorbidConditionRepoMock = mock(ComorbidConditionRepo.class, "comorbidConditionRepo");

    private final GrossMotorMilestoneRepo grossMotorMilestoneRepoMock = mock(GrossMotorMilestoneRepo.class, "grossMotorMilestoneRepo");

    private final FundalHeightRepo fundalHeightRepoMock = mock(FundalHeightRepo.class, "fundalHeightRepo");

    private final CompFeedsRepo compFeedsRepoMock = mock(CompFeedsRepo.class, "compFeedsRepo");

    private final PregOutcomeRepo pregOutcomeRepoMock = mock(PregOutcomeRepo.class, "pregOutcomeRepo");

    private final ComplicationTypesRepo complicationTypesRepoMock = mock(ComplicationTypesRepo.class, "complicationTypesRepo");

    private final ServiceFacilityMasterRepo serviceFacilityMasterRepoMock = mock(ServiceFacilityMasterRepo.class, "serviceFacilityMasterRepo");

    private final ChiefComplaintMasterRepo chiefComplaintMasterRepoMock = mock(ChiefComplaintMasterRepo.class, "chiefComplaintMasterRepo");

    private final DiseaseTypeRepo diseaseTypeRepoMock = mock(DiseaseTypeRepo.class, "diseaseTypeRepo");

    private final PersonalHabitTypeRepo personalHabitTypeRepoMock = mock(PersonalHabitTypeRepo.class, "personalHabitTypeRepo");

    private final FamilyMemberMasterRepo familyMemberMasterRepoMock = mock(FamilyMemberMasterRepo.class, "familyMemberMasterRepo");

    private final ProcedureRepo procedureRepoMock = mock(ProcedureRepo.class, "procedureRepo");

    private final NewbornHealthStatusRepo newbornHealthStatusRepoMock = mock(NewbornHealthStatusRepo.class, "newbornHealthStatusRepo");

    private final OptionalVaccinationsRepo optionalVaccinationsRepoMock = mock(OptionalVaccinationsRepo.class, "optionalVaccinationsRepo");

    private final CovidSymptomsMasterRepo covidSymptomsMasterRepoMock = mock(CovidSymptomsMasterRepo.class, "covidSymptomsMasterRepo");

    private final CovidContactHistoryMasterRepo covidContactHistoryMasterRepoMock = mock(CovidContactHistoryMasterRepo.class, "covidContactHistoryMasterRepo");

    private final CovidRecommnedationMasterRepo covidRecommnedationMasterRepoMock = mock(CovidRecommnedationMasterRepo.class, "covidRecommnedationMasterRepo");

    private final FoetalMonitorTestsRepo foetakMonitorTestRepoMock = mock(FoetalMonitorTestsRepo.class, "foetakMonitorTestRepo");

    private final ItemMasterRepo itemMasterRepoMock = mock(ItemMasterRepo.class, "itemMasterRepo");

    private final MasterVanRepo masterVanRepoMock = mock(MasterVanRepo.class, "masterVanRepo");

    private final CounsellingTypeRepo counsellingTypeRepoMock = mock(CounsellingTypeRepo.class, "counsellingTypeRepo");

    private final ServiceMasterRepo serviceMasterRepoMock = mock(ServiceMasterRepo.class, "serviceMasterRepo");

    private final InstituteRepo instituteRepoMock = mock(InstituteRepo.class, "instituteRepo");

    private final ItemFormMasterRepo itemFormMasterRepoMock = mock(ItemFormMasterRepo.class, "itemFormMasterRepo");

    private final DrugDoseMasterRepo drugDoseMasterRepoMock = mock(DrugDoseMasterRepo.class, "drugDoseMasterRepo");

    private final DrugDurationUnitMasterRepo drugDurationUnitMasterRepoMock = mock(DrugDurationUnitMasterRepo.class, "drugDurationUnitMasterRepo");

    private final DrugFrequencyMasterRepo drugFrequencyMasterRepoMock = mock(DrugFrequencyMasterRepo.class, "drugFrequencyMasterRepo");

    private final RouteOfAdminRepo routeOfAdminRepoMock = mock(RouteOfAdminRepo.class, "routeOfAdminRepo");

    private final V_DrugPrescriptionRepo v_DrugPrescriptionRepoMock = mock(V_DrugPrescriptionRepo.class, "v_DrugPrescriptionRepo");

    private final NCDScreeningMasterServiceImpl ncdScreeningMasterServiceImplMock = mock(NCDScreeningMasterServiceImpl.class, "ncdScreeningMasterServiceImpl");

    private final NCDCareTypeRepo ncdCareTypeRepoMock = mock(NCDCareTypeRepo.class, "ncdCareTypeRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ANCMasterDataServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${ec876e52-18ac-3250-bc02-0868023a7552}, hash: 2777E4F94719C1D210CB560C803D26E5
    @Disabled()
    @Test()
    void getCommonNurseMasterDataForGenopdAncNcdcarePncWhenVisitCategoryIDEquals4() {
        /* Branches:* (visitCategoryID == 5) : true* (visitCategoryID == 8) : false* (visitCategoryID == 10) : true* (visitCategoryID == 4) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<FoetalMonitorTestMaster> foetalMonitorTestMaster = mockStatic(FoetalMonitorTestMaster.class);
             MockedStatic<OptionalVaccinations> optionalVaccinations = mockStatic(OptionalVaccinations.class);
             MockedStatic<ProcedureData> procedureData = mockStatic(ProcedureData.class);
             MockedStatic<FamilyMemberType> familyMemberType = mockStatic(FamilyMemberType.class);
             MockedStatic<PersonalHabitType> personalHabitType = mockStatic(PersonalHabitType.class);
             MockedStatic<DiseaseType> diseaseType = mockStatic(DiseaseType.class);
             MockedStatic<ChiefComplaintMaster> chiefComplaintMaster = mockStatic(ChiefComplaintMaster.class);
             MockedStatic<ComplicationTypes> complicationTypes = mockStatic(ComplicationTypes.class);
             MockedStatic<PregOutcome> pregOutcome = mockStatic(PregOutcome.class);
             MockedStatic<CompFeeds> compFeeds = mockStatic(CompFeeds.class);
             MockedStatic<FundalHeight> fundalHeight = mockStatic(FundalHeight.class);
             MockedStatic<GrossMotorMilestone> grossMotorMilestone = mockStatic(GrossMotorMilestone.class);
             MockedStatic<ComorbidCondition> comorbidCondition = mockStatic(ComorbidCondition.class);
             MockedStatic<SurgeryTypes> surgeryTypes = mockStatic(SurgeryTypes.class);
             MockedStatic<PregDuration> pregDuration = mockStatic(PregDuration.class);
             MockedStatic<Musculoskeletal> musculoskeletal = mockStatic(Musculoskeletal.class);
             MockedStatic<MenstrualProblem> menstrualProblem = mockStatic(MenstrualProblem.class);
             MockedStatic<MenstrualCycleStatus> menstrualCycleStatus = mockStatic(MenstrualCycleStatus.class);
             MockedStatic<MenstrualCycleRange> menstrualCycleRange = mockStatic(MenstrualCycleRange.class);
             MockedStatic<JointTypes> jointTypes = mockStatic(JointTypes.class);
             MockedStatic<IllnessTypes> illnessTypes = mockStatic(IllnessTypes.class);
             MockedStatic<Gestation> gestation = mockStatic(Gestation.class);
             MockedStatic<DevelopmentProblems> developmentProblems = mockStatic(DevelopmentProblems.class);
             MockedStatic<DeliveryType> deliveryType = mockStatic(DeliveryType.class);
             MockedStatic<DeliveryPlace> deliveryPlace = mockStatic(DeliveryPlace.class);
             MockedStatic<ChildVaccinations> childVaccinations = mockStatic(ChildVaccinations.class);
             MockedStatic<BloodGroups> bloodGroups = mockStatic(BloodGroups.class);
             MockedStatic<AllergicReactionTypes> allergicReactionTypes = mockStatic(AllergicReactionTypes.class);
             MockedStatic<NewbornHealthStatus> newbornHealthStatus = mockStatic(NewbornHealthStatus.class)) {
            ArrayList<ComplicationTypes> complicationTypesList = new ArrayList<>();
            ArrayList<ComplicationTypes> complicationTypesList2 = new ArrayList<>();
            ArrayList<NewbornHealthStatus> newbornHealthStatusList = new ArrayList<>();
            newbornHealthStatus.when(() -> NewbornHealthStatus.getNewbornHealthStatuses((ArrayList) any())).thenReturn(newbornHealthStatusList);
            ArrayList<AllergicReactionTypes> allergicReactionTypesList = new ArrayList<>();
            allergicReactionTypes.when(() -> AllergicReactionTypes.getAllergicReactionTypes((ArrayList) any())).thenReturn(allergicReactionTypesList);
            ArrayList<BloodGroups> bloodGroupsList = new ArrayList<>();
            bloodGroups.when(() -> BloodGroups.getBloodGroups((ArrayList) any())).thenReturn(bloodGroupsList);
            ArrayList<ChildVaccinations> childVaccinationsList = new ArrayList<>();
            childVaccinations.when(() -> ChildVaccinations.getChildVaccinations((ArrayList) any())).thenReturn(childVaccinationsList);
            ArrayList<DeliveryPlace> deliveryPlaceList = new ArrayList<>();
            deliveryPlace.when(() -> DeliveryPlace.getDeliveryPlace((ArrayList) any())).thenReturn(deliveryPlaceList);
            ArrayList<DeliveryType> deliveryTypeList = new ArrayList<>();
            deliveryType.when(() -> DeliveryType.getDeliveryType((ArrayList) any())).thenReturn(deliveryTypeList);
            ArrayList<DevelopmentProblems> developmentProblemsList = new ArrayList<>();
            developmentProblems.when(() -> DevelopmentProblems.getDevelopmentProblems((ArrayList) any())).thenReturn(developmentProblemsList);
            ArrayList<Gestation> gestationList = new ArrayList<>();
            gestation.when(() -> Gestation.getGestations((ArrayList) any())).thenReturn(gestationList);
            ArrayList<IllnessTypes> illnessTypesList = new ArrayList<>();
            illnessTypes.when(() -> IllnessTypes.getIllnessTypes((ArrayList) any())).thenReturn(illnessTypesList);
            ArrayList<JointTypes> jointTypesList = new ArrayList<>();
            jointTypes.when(() -> JointTypes.getJointTypes((ArrayList) any())).thenReturn(jointTypesList);
            ArrayList<MenstrualCycleRange> menstrualCycleRangeList = new ArrayList<>();
            ArrayList<MenstrualCycleRange> menstrualCycleRangeList2 = new ArrayList<>();
            menstrualCycleRange.when(() -> MenstrualCycleRange.getMenstrualCycleRanges((ArrayList) any())).thenReturn(menstrualCycleRangeList).thenReturn(menstrualCycleRangeList2);
            ArrayList<MenstrualCycleStatus> menstrualCycleStatusList = new ArrayList<>();
            menstrualCycleStatus.when(() -> MenstrualCycleStatus.getMenstrualCycleStatuses((ArrayList) any())).thenReturn(menstrualCycleStatusList);
            ArrayList<MenstrualProblem> menstrualProblemList = new ArrayList<>();
            menstrualProblem.when(() -> MenstrualProblem.getMenstrualProblems((ArrayList) any())).thenReturn(menstrualProblemList);
            ArrayList<Musculoskeletal> musculoskeletalList = new ArrayList<>();
            ArrayList<Musculoskeletal> musculoskeletalList2 = new ArrayList<>();
            musculoskeletal.when(() -> Musculoskeletal.getMusculoskeletals((ArrayList) any())).thenReturn(musculoskeletalList).thenReturn(musculoskeletalList2);
            ArrayList<PregDuration> pregDurationList = new ArrayList<>();
            pregDuration.when(() -> PregDuration.getPregDurationValues((ArrayList) any())).thenReturn(pregDurationList);
            ArrayList<SurgeryTypes> surgeryTypesList = new ArrayList<>();
            surgeryTypes.when(() -> SurgeryTypes.getSurgeryTypes((ArrayList) any())).thenReturn(surgeryTypesList);
            ArrayList<ComorbidCondition> comorbidConditionList = new ArrayList<>();
            comorbidCondition.when(() -> ComorbidCondition.getComorbidConditions((ArrayList) any())).thenReturn(comorbidConditionList);
            ArrayList<GrossMotorMilestone> grossMotorMilestoneList = new ArrayList<>();
            grossMotorMilestone.when(() -> GrossMotorMilestone.getGrossMotorMilestone((ArrayList) any())).thenReturn(grossMotorMilestoneList);
            ArrayList<FundalHeight> fundalHeightList = new ArrayList<>();
            fundalHeight.when(() -> FundalHeight.getFundalHeights((ArrayList) any())).thenReturn(fundalHeightList);
            ArrayList<CompFeeds> compFeedsList = new ArrayList<>();
            ArrayList<CompFeeds> compFeedsList2 = new ArrayList<>();
            ArrayList<CompFeeds> compFeedsList3 = new ArrayList<>();
            compFeeds.when(() -> CompFeeds.getCompFeeds((ArrayList) any())).thenReturn(compFeedsList).thenReturn(compFeedsList2).thenReturn(compFeedsList3);
            ArrayList<PregOutcome> pregOutcomeList = new ArrayList<>();
            pregOutcome.when(() -> PregOutcome.getPregOutcomes((ArrayList) any())).thenReturn(pregOutcomeList);
            ArrayList<ComplicationTypes> complicationTypesList3 = new ArrayList<>();
            ArrayList<ComplicationTypes> complicationTypesList4 = new ArrayList<>();
            complicationTypes.when(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(2))).thenReturn(complicationTypesList4);
            ArrayList<ComplicationTypes> complicationTypesList5 = new ArrayList<>();
            complicationTypes.when(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(3))).thenReturn(complicationTypesList5);
            ArrayList<ComplicationTypes> complicationTypesList6 = new ArrayList<>();
            complicationTypes.when(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(1))).thenReturn(complicationTypesList6);
            ArrayList<ComplicationTypes> complicationTypesList7 = new ArrayList<>();
            ArrayList<ComplicationTypes> complicationTypesList8 = new ArrayList<>();
            complicationTypes.when(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(0))).thenReturn(complicationTypesList).thenReturn(complicationTypesList2).thenReturn(complicationTypesList3).thenReturn(complicationTypesList7).thenReturn(complicationTypesList8);
            ArrayList<ChiefComplaintMaster> chiefComplaintMasterList = new ArrayList<>();
            chiefComplaintMaster.when(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any())).thenReturn(chiefComplaintMasterList);
            ArrayList<DiseaseType> diseaseTypeList = new ArrayList<>();
            diseaseType.when(() -> DiseaseType.getDiseaseTypes((ArrayList) any())).thenReturn(diseaseTypeList);
            ArrayList<PersonalHabitType> personalHabitTypeList = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList2 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList3 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList4 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList5 = new ArrayList<>();
            ArrayList<PersonalHabitType> personalHabitTypeList6 = new ArrayList<>();
            personalHabitType.when(() -> PersonalHabitType.getPersonalHabitTypeMasterData((ArrayList) any())).thenReturn(personalHabitTypeList).thenReturn(personalHabitTypeList2).thenReturn(personalHabitTypeList3).thenReturn(personalHabitTypeList4).thenReturn(personalHabitTypeList5).thenReturn(personalHabitTypeList6);
            ArrayList<FamilyMemberType> familyMemberTypeList = new ArrayList<>();
            familyMemberType.when(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any())).thenReturn(familyMemberTypeList);
            ArrayList<ProcedureData> procedureDataList = new ArrayList<>();
            procedureData.when(() -> ProcedureData.getProcedures((ArrayList) any())).thenReturn(procedureDataList);
            ArrayList<OptionalVaccinations> optionalVaccinationsList = new ArrayList<>();
            optionalVaccinations.when(() -> OptionalVaccinations.getOptionalVaccinations((ArrayList) any())).thenReturn(optionalVaccinationsList);
            ArrayList<FoetalMonitorTestMaster> foetalMonitorTestMasterList = new ArrayList<>();
            foetalMonitorTestMaster.when(() -> FoetalMonitorTestMaster.getFoetalMonitorMasters((ArrayList) any())).thenReturn(foetalMonitorTestMasterList);
            target = new ANCMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(allergicReactionTypesRepoMock).getAllergicReactionTypes();
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(bloodGroupsRepoMock).getBloodGroups();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(childVaccinationsRepoMock).getChildVaccinations();
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(deliveryPlaceRepoMock).getDeliveryPlaces();
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(deliveryTypeRepoMock).getDeliveryTypes();
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(developmentProblemsRepoMock).getDevelopmentProblems();
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(gestationRepoMock).getGestationTypes();
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(illnessTypesRepoMock).getIllnessTypes(0);
            ArrayList<Object[]> objectList9 = new ArrayList<>();
            doReturn(objectList9).when(jointTypesRepoMock).getJointTypes();
            ArrayList<Object[]> objectList10 = new ArrayList<>();
            doReturn(objectList10).when(menstrualCycleRangeRepoMock).getMenstrualCycleRanges("Cycle Length");
            ArrayList<Object[]> objectList11 = new ArrayList<>();
            doReturn(objectList11).when(menstrualCycleRangeRepoMock).getMenstrualCycleRanges(" Blood Flow Duration");
            ArrayList<Object[]> objectList12 = new ArrayList<>();
            doReturn(objectList12).when(menstrualCycleStatusRepoMock).getMenstrualCycleStatuses(0);
            ArrayList<Object[]> objectList13 = new ArrayList<>();
            doReturn(objectList13).when(menstrualProblemRepoMock).getMenstrualProblems();
            ArrayList<Object[]> objectList14 = new ArrayList<>();
            doReturn(objectList14).when(musculoskeletalRepoMock).getMusculoskeletalvalues("Laterality");
            ArrayList<Object[]> objectList15 = new ArrayList<>();
            doReturn(objectList15).when(musculoskeletalRepoMock).getMusculoskeletalvalues("Abnormality");
            ArrayList<Object[]> objectList16 = new ArrayList<>();
            doReturn(objectList16).when(pregDurationRepoMock).getPregDurationTypes();
            ArrayList<Object[]> objectList17 = new ArrayList<>();
            doReturn(objectList17).when(surgeryTypesRepoMock).getSurgeryTypes(0, "gender1");
            ArrayList<Object[]> objectList18 = new ArrayList<>();
            doReturn(objectList18).when(comorbidConditionRepoMock).getComorbidConditions(0);
            ArrayList<Object[]> objectList19 = new ArrayList<>();
            doReturn(objectList19).when(grossMotorMilestoneRepoMock).getGrossMotorMilestones();
            ArrayList<Object[]> objectList20 = new ArrayList<>();
            doReturn(objectList20).when(fundalHeightRepoMock).getFundalHeights();
            ArrayList<Object[]> objectList21 = new ArrayList<>();
            doReturn(objectList21).when(compFeedsRepoMock).getCompFeeds("Feed Type");
            ArrayList<Object[]> objectList22 = new ArrayList<>();
            doReturn(objectList22).when(compFeedsRepoMock).getCompFeeds("Comp Feed Age");
            ArrayList<Object[]> objectList23 = new ArrayList<>();
            doReturn(objectList23).when(compFeedsRepoMock).getCompFeeds("Comp Feed Serving ");
            ArrayList<Object[]> objectList24 = new ArrayList<>();
            doReturn(objectList24).when(pregOutcomeRepoMock).getPregOutcomes();
            ArrayList<Object[]> objectList25 = new ArrayList<>();
            doReturn(objectList25).when(complicationTypesRepoMock).getComplicationTypes("Birth Complication");
            ArrayList<Object[]> objectList26 = new ArrayList<>();
            doReturn(objectList26).when(complicationTypesRepoMock).getComplicationTypes("Delivery Complication");
            ArrayList<Object[]> objectList27 = new ArrayList<>();
            doReturn(objectList27).when(complicationTypesRepoMock).getComplicationTypes("Postpartum Complication");
            ArrayList<Object[]> objectList28 = new ArrayList<>();
            doReturn(objectList28).when(complicationTypesRepoMock).getComplicationTypes("Pregnancy Complication");
            ArrayList<Object[]> objectList29 = new ArrayList<>();
            doReturn(objectList29).when(complicationTypesRepoMock).getComplicationTypes("Postnatal Complication");
            ArrayList<Object[]> objectList30 = new ArrayList<>();
            doReturn(objectList30).when(complicationTypesRepoMock).getComplicationTypes("typeOfAbortion");
            ArrayList<Object[]> objectList31 = new ArrayList<>();
            doReturn(objectList31).when(complicationTypesRepoMock).getComplicationTypes("PostAbortionComplications");
            ArrayList<ServiceFacilityMaster> serviceFacilityMasterList = new ArrayList<>();
            doReturn(serviceFacilityMasterList).when(serviceFacilityMasterRepoMock).findByDeleted(false);
            ArrayList<Object[]> objectList32 = new ArrayList<>();
            doReturn(objectList32).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
            ArrayList<Object[]> objectList33 = new ArrayList<>();
            doReturn(objectList33).when(diseaseTypeRepoMock).getDiseaseTypes();
            ArrayList<Object[]> objectList34 = new ArrayList<>();
            doReturn(objectList34).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Tobacco Use Status");
            ArrayList<Object[]> objectList35 = new ArrayList<>();
            doReturn(objectList35).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Tobacco Use");
            ArrayList<Object[]> objectList36 = new ArrayList<>();
            doReturn(objectList36).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Alcohol Intake Status");
            ArrayList<Object[]> objectList37 = new ArrayList<>();
            doReturn(objectList37).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Alcohol");
            ArrayList<Object[]> objectList38 = new ArrayList<>();
            doReturn(objectList38).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Frequency of Alcohol Intake");
            ArrayList<Object[]> objectList39 = new ArrayList<>();
            doReturn(objectList39).when(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Average Quantity of Alcohol consumption");
            ArrayList<Object[]> objectList40 = new ArrayList<>();
            doReturn(objectList40).when(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
            ArrayList<Object[]> objectList41 = new ArrayList<>();
            doReturn(objectList41).when(procedureRepoMock).getProcedureMasterData(0, "gender1");
            ArrayList<Object[]> objectList42 = new ArrayList<>();
            doReturn(objectList42).when(newbornHealthStatusRepoMock).getnewBornHealthStatuses();
            ArrayList<Object[]> objectList43 = new ArrayList<>();
            doReturn(objectList43).when(optionalVaccinationsRepoMock).getOptionalVaccinations();
            ArrayList<CovidSymptomsMaster> covidSymptomsMasterList = new ArrayList<>();
            doReturn(covidSymptomsMasterList).when(covidSymptomsMasterRepoMock).findByDeleted(false);
            ArrayList<CovidContactHistoryMaster> covidContactHistoryMasterList = new ArrayList<>();
            doReturn(covidContactHistoryMasterList).when(covidContactHistoryMasterRepoMock).findByDeleted(false);
            ArrayList<CovidRecommendationMaster> covidRecommendationMasterList = new ArrayList<>();
            doReturn(covidRecommendationMasterList).when(covidRecommnedationMasterRepoMock).findByDeleted(false);
            ArrayList<Object[]> objectList44 = new ArrayList<>();
            doReturn(objectList44).when(foetakMonitorTestRepoMock).getFoetalMonitorTestsDetails(0);
            //Act Statement(s)
            String result = target.getCommonNurseMasterDataForGenopdAncNcdcarePnc(0, 0, "gender1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                complicationTypes.verify(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(0)), atLeast(5));
                newbornHealthStatus.verify(() -> NewbornHealthStatus.getNewbornHealthStatuses((ArrayList) any()));
                allergicReactionTypes.verify(() -> AllergicReactionTypes.getAllergicReactionTypes((ArrayList) any()));
                bloodGroups.verify(() -> BloodGroups.getBloodGroups((ArrayList) any()));
                childVaccinations.verify(() -> ChildVaccinations.getChildVaccinations((ArrayList) any()));
                deliveryPlace.verify(() -> DeliveryPlace.getDeliveryPlace((ArrayList) any()));
                deliveryType.verify(() -> DeliveryType.getDeliveryType((ArrayList) any()));
                developmentProblems.verify(() -> DevelopmentProblems.getDevelopmentProblems((ArrayList) any()));
                gestation.verify(() -> Gestation.getGestations((ArrayList) any()));
                illnessTypes.verify(() -> IllnessTypes.getIllnessTypes((ArrayList) any()));
                jointTypes.verify(() -> JointTypes.getJointTypes((ArrayList) any()));
                menstrualCycleRange.verify(() -> MenstrualCycleRange.getMenstrualCycleRanges((ArrayList) any()), atLeast(2));
                menstrualCycleStatus.verify(() -> MenstrualCycleStatus.getMenstrualCycleStatuses((ArrayList) any()));
                menstrualProblem.verify(() -> MenstrualProblem.getMenstrualProblems((ArrayList) any()));
                musculoskeletal.verify(() -> Musculoskeletal.getMusculoskeletals((ArrayList) any()), atLeast(2));
                pregDuration.verify(() -> PregDuration.getPregDurationValues((ArrayList) any()));
                surgeryTypes.verify(() -> SurgeryTypes.getSurgeryTypes((ArrayList) any()));
                comorbidCondition.verify(() -> ComorbidCondition.getComorbidConditions((ArrayList) any()));
                grossMotorMilestone.verify(() -> GrossMotorMilestone.getGrossMotorMilestone((ArrayList) any()));
                fundalHeight.verify(() -> FundalHeight.getFundalHeights((ArrayList) any()));
                compFeeds.verify(() -> CompFeeds.getCompFeeds((ArrayList) any()), atLeast(3));
                pregOutcome.verify(() -> PregOutcome.getPregOutcomes((ArrayList) any()));
                complicationTypes.verify(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(2)));
                complicationTypes.verify(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(3)));
                complicationTypes.verify(() -> ComplicationTypes.getComplicationTypes((ArrayList) any(), eq(1)));
                chiefComplaintMaster.verify(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any()));
                diseaseType.verify(() -> DiseaseType.getDiseaseTypes((ArrayList) any()));
                personalHabitType.verify(() -> PersonalHabitType.getPersonalHabitTypeMasterData((ArrayList) any()), atLeast(6));
                familyMemberType.verify(() -> FamilyMemberType.getFamilyMemberTypeMasterData((ArrayList) any()));
                procedureData.verify(() -> ProcedureData.getProcedures((ArrayList) any()));
                optionalVaccinations.verify(() -> OptionalVaccinations.getOptionalVaccinations((ArrayList) any()));
                foetalMonitorTestMaster.verify(() -> FoetalMonitorTestMaster.getFoetalMonitorMasters((ArrayList) any()));
                verify(allergicReactionTypesRepoMock).getAllergicReactionTypes();
                verify(bloodGroupsRepoMock).getBloodGroups();
                verify(childVaccinationsRepoMock).getChildVaccinations();
                verify(deliveryPlaceRepoMock).getDeliveryPlaces();
                verify(deliveryTypeRepoMock).getDeliveryTypes();
                verify(developmentProblemsRepoMock).getDevelopmentProblems();
                verify(gestationRepoMock).getGestationTypes();
                verify(illnessTypesRepoMock).getIllnessTypes(0);
                verify(jointTypesRepoMock).getJointTypes();
                verify(menstrualCycleRangeRepoMock).getMenstrualCycleRanges("Cycle Length");
                verify(menstrualCycleRangeRepoMock).getMenstrualCycleRanges(" Blood Flow Duration");
                verify(menstrualCycleStatusRepoMock).getMenstrualCycleStatuses(0);
                verify(menstrualProblemRepoMock).getMenstrualProblems();
                verify(musculoskeletalRepoMock).getMusculoskeletalvalues("Laterality");
                verify(musculoskeletalRepoMock).getMusculoskeletalvalues("Abnormality");
                verify(pregDurationRepoMock).getPregDurationTypes();
                verify(surgeryTypesRepoMock).getSurgeryTypes(0, "gender1");
                verify(comorbidConditionRepoMock).getComorbidConditions(0);
                verify(grossMotorMilestoneRepoMock).getGrossMotorMilestones();
                verify(fundalHeightRepoMock).getFundalHeights();
                verify(compFeedsRepoMock).getCompFeeds("Feed Type");
                verify(compFeedsRepoMock).getCompFeeds("Comp Feed Age");
                verify(compFeedsRepoMock).getCompFeeds("Comp Feed Serving ");
                verify(pregOutcomeRepoMock).getPregOutcomes();
                verify(complicationTypesRepoMock).getComplicationTypes("Birth Complication");
                verify(complicationTypesRepoMock).getComplicationTypes("Delivery Complication");
                verify(complicationTypesRepoMock).getComplicationTypes("Postpartum Complication");
                verify(complicationTypesRepoMock).getComplicationTypes("Pregnancy Complication");
                verify(complicationTypesRepoMock).getComplicationTypes("Postnatal Complication");
                verify(complicationTypesRepoMock).getComplicationTypes("typeOfAbortion");
                verify(complicationTypesRepoMock).getComplicationTypes("PostAbortionComplications");
                verify(serviceFacilityMasterRepoMock).findByDeleted(false);
                verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
                verify(diseaseTypeRepoMock).getDiseaseTypes();
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Tobacco Use Status");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Tobacco Use");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Alcohol Intake Status");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Type of Alcohol");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Frequency of Alcohol Intake");
                verify(personalHabitTypeRepoMock).getPersonalHabitTypeMaster("Average Quantity of Alcohol consumption");
                verify(familyMemberMasterRepoMock).getFamilyMemberTypeMaster();
                verify(procedureRepoMock).getProcedureMasterData(0, "gender1");
                verify(newbornHealthStatusRepoMock).getnewBornHealthStatuses();
                verify(optionalVaccinationsRepoMock).getOptionalVaccinations();
                verify(covidSymptomsMasterRepoMock).findByDeleted(false);
                verify(covidContactHistoryMasterRepoMock).findByDeleted(false);
                verify(covidRecommnedationMasterRepoMock).findByDeleted(false);
                verify(foetakMonitorTestRepoMock).getFoetalMonitorTestsDetails(0);
            });
        }
    }

    //Sapient generated method id: ${14d59d33-9855-3a37-a361-db90f8953386}, hash: AE73B45752C548330FDB0CE844588BB1
    @Test()
    void getCommonDoctorMasterDataForGenopdAncNcdcarePncWhenFIDIsNotNullAndFIDGreaterThan0AndVisitCategoryIDEquals32() {
        /* Branches:* (visitCategoryID != 7) : true* (i < NonedlList.size()) : true* (NonedlList.get(i).getUom() != null) : true* (facilityID == null) : false* (facilityID <= 0) : true* (fID != null) : true* (fID > 0) : true* (visitCategoryID == 3) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        /*try (MockedStatic<NCDCareType> nCDCareType = mockStatic(NCDCareType.class);
    MockedStatic<NCDScreeningCondition> nCDScreeningCondition = mockStatic(NCDScreeningCondition.class);
    MockedStatic<RouteOfAdmin> routeOfAdmin = mockStatic(RouteOfAdmin.class);
    MockedStatic<DrugFrequencyMaster> drugFrequencyMaster = mockStatic(DrugFrequencyMaster.class);
    MockedStatic<DrugDurationUnitMaster> drugDurationUnitMaster = mockStatic(DrugDurationUnitMaster.class);
    MockedStatic<DrugDoseMaster> drugDoseMaster = mockStatic(DrugDoseMaster.class);
    MockedStatic<ItemFormMaster> itemFormMaster = mockStatic(ItemFormMaster.class);
    MockedStatic<ServiceMaster> serviceMaster = mockStatic(ServiceMaster.class);
    MockedStatic<Institute> institute = mockStatic(Institute.class);
    MockedStatic<CounsellingType> counsellingType = mockStatic(CounsellingType.class)) {
    ArrayList<CounsellingType> counsellingTypeList = new ArrayList<>();
    counsellingType.when(() -> CounsellingType.getCounsellingType((ArrayList) any())).thenReturn(counsellingTypeList);
    ArrayList<Institute> instituteList = new ArrayList<>();
    institute.when(() -> Institute.getinstituteDetails((ArrayList) any())).thenReturn(instituteList);
    ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
    serviceMaster.when(() -> ServiceMaster.getServiceMaster((ArrayList) any())).thenReturn(serviceMasterList);
    ArrayList<ItemFormMaster> itemFormMasterList = new ArrayList<>();
    itemFormMaster.when(() -> ItemFormMaster.getItemFormList((ArrayList) any())).thenReturn(itemFormMasterList);
    ArrayList<DrugDoseMaster> drugDoseMasterList = new ArrayList<>();
    drugDoseMaster.when(() -> DrugDoseMaster.getDrugDoseMasters((ArrayList) any())).thenReturn(drugDoseMasterList);
    ArrayList<DrugDurationUnitMaster> drugDurationUnitMasterList = new ArrayList<>();
    drugDurationUnitMaster.when(() -> DrugDurationUnitMaster.getDrugDurationUnitMaster((ArrayList) any())).thenReturn(drugDurationUnitMasterList);
    ArrayList<DrugFrequencyMaster> drugFrequencyMasterList = new ArrayList<>();
    drugFrequencyMaster.when(() -> DrugFrequencyMaster.getDrugFrequencyMaster((ArrayList) any())).thenReturn(drugFrequencyMasterList);
    ArrayList<RouteOfAdmin> routeOfAdminList = new ArrayList<>();
    routeOfAdmin.when(() -> RouteOfAdmin.getRouteOfAdminList((ArrayList) any())).thenReturn(routeOfAdminList);
    ArrayList<NCDScreeningCondition> nCDScreeningConditionList = new ArrayList<>();
    nCDScreeningCondition.when(() -> NCDScreeningCondition.getNCDScreeningCondition((ArrayList) any())).thenReturn(nCDScreeningConditionList);
    ArrayList<NCDCareType> nCDCareTypeList = new ArrayList<>();
    nCDCareType.when(() -> NCDCareType.getNCDCareTypes((ArrayList) any())).thenReturn(nCDCareTypeList);
    target = new ANCMasterDataServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(counsellingTypeRepoMock).getCounsellingTypes();
    ArrayList<Object[]> objectList2 = new ArrayList<>();
    doReturn(objectList2).when(serviceMasterRepoMock).getAdditionalServices();
    ArrayList<Object[]> objectList3 = new ArrayList<>();
    doReturn(objectList3).when(instituteRepoMock).getInstituteDetails(0);
    ArrayList<Object[]> objectList4 = new ArrayList<>();
    doReturn(objectList4).when(itemFormMasterRepoMock).getItemFormMaster();
    ArrayList<Object[]> objectList5 = new ArrayList<>();
    doReturn(objectList5).when(drugDoseMasterRepoMock).getDrugDoseMaster();
    ArrayList<Object[]> objectList6 = new ArrayList<>();
    doReturn(objectList6).when(drugDurationUnitMasterRepoMock).getDrugDurationUnitMaster();
    ArrayList<Object[]> objectList7 = new ArrayList<>();
    doReturn(objectList7).when(drugFrequencyMasterRepoMock).getDrugFrequencyMaster();
    ArrayList<Object[]> objectList8 = new ArrayList<>();
    doReturn(objectList8).when(routeOfAdminRepoMock).getRouteOfAdminList();
    M_Uom m_Uom = new M_Uom();
    m_Uom.setUOMName("unitOfMeasurement1");
    ItemMaster itemMaster = new ItemMaster();
    itemMaster.setUnitOfMeasurement("unitOfMeasurement1");
    itemMaster.setUom(m_Uom);
    ArrayList<ItemMaster> itemMasterList = new ArrayList<>();
    itemMasterList.add(itemMaster);
    doReturn(itemMasterList).when(itemMasterRepoMock).searchEdl(0);
    doReturn(1).when(masterVanRepoMock).getFacilityID(0);
    ArrayList<V_DrugPrescription> v_DrugPrescriptionList = new ArrayList<>();
    doReturn(v_DrugPrescriptionList).when(v_DrugPrescriptionRepoMock).getItemListForFacility(1);
    ArrayList arrayList = new ArrayList<>();
    doReturn(arrayList).when(ncdScreeningMasterServiceImplMock).getNCDScreeningConditions();
    ArrayList<Object[]> objectList9 = new ArrayList<>();
    doReturn(objectList9).when(ncdCareTypeRepoMock).getNCDCareTypes();
    //Act Statement(s)
    String result = target.getCommonDoctorMasterDataForGenopdAncNcdcarePnc(3, 0, "gender1", 0, 0);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("result1"));
        counsellingType.verify(() -> CounsellingType.getCounsellingType((ArrayList) any()));
        institute.verify(() -> Institute.getinstituteDetails((ArrayList) any()));
        serviceMaster.verify(() -> ServiceMaster.getServiceMaster((ArrayList) any()));
        itemFormMaster.verify(() -> ItemFormMaster.getItemFormList((ArrayList) any()));
        drugDoseMaster.verify(() -> DrugDoseMaster.getDrugDoseMasters((ArrayList) any()));
        drugDurationUnitMaster.verify(() -> DrugDurationUnitMaster.getDrugDurationUnitMaster((ArrayList) any()));
        drugFrequencyMaster.verify(() -> DrugFrequencyMaster.getDrugFrequencyMaster((ArrayList) any()));
        routeOfAdmin.verify(() -> RouteOfAdmin.getRouteOfAdminList((ArrayList) any()));
        nCDScreeningCondition.verify(() -> NCDScreeningCondition.getNCDScreeningCondition((ArrayList) any()));
        nCDCareType.verify(() -> NCDCareType.getNCDCareTypes((ArrayList) any()));
        verify(counsellingTypeRepoMock).getCounsellingTypes();
        verify(serviceMasterRepoMock).getAdditionalServices();
        verify(instituteRepoMock).getInstituteDetails(0);
        verify(itemFormMasterRepoMock).getItemFormMaster();
        verify(drugDoseMasterRepoMock).getDrugDoseMaster();
        verify(drugDurationUnitMasterRepoMock).getDrugDurationUnitMaster();
        verify(drugFrequencyMasterRepoMock).getDrugFrequencyMaster();
        verify(routeOfAdminRepoMock).getRouteOfAdminList();
        verify(itemMasterRepoMock).searchEdl(0);
        verify(masterVanRepoMock).getFacilityID(0);
        verify(v_DrugPrescriptionRepoMock).getItemListForFacility(1);
        verify(ncdScreeningMasterServiceImplMock).getNCDScreeningConditions();
        verify(ncdCareTypeRepoMock).getNCDCareTypes();
    });
}*/
    }

    //Sapient generated method id: ${bcdbaa7d-e1a7-3fb2-a8b2-76379bdcedf5}, hash: 725F87D5EFF86CE3D105146A3D82E0A5
    @Disabled()
    @Test()
    void getCommonDoctorMasterDataForGenopdAncNcdcarePncWhenFIDIsNotNullAndFIDGreaterThan0AndVisitCategoryIDEquals34() {
        /* Branches:* (visitCategoryID != 7) : false* (i < NonedlList.size()) : true* (NonedlList.get(i).getUom() != null) : true* (facilityID == null) : false* (facilityID <= 0) : true* (fID != null) : true* (fID > 0) : true* (visitCategoryID == 3) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<NCDCareType> nCDCareType = mockStatic(NCDCareType.class);
             MockedStatic<NCDScreeningCondition> nCDScreeningCondition = mockStatic(NCDScreeningCondition.class);
             MockedStatic<RouteOfAdmin> routeOfAdmin = mockStatic(RouteOfAdmin.class);
             MockedStatic<DrugFrequencyMaster> drugFrequencyMaster = mockStatic(DrugFrequencyMaster.class);
             MockedStatic<DrugDurationUnitMaster> drugDurationUnitMaster = mockStatic(DrugDurationUnitMaster.class);
             MockedStatic<DrugDoseMaster> drugDoseMaster = mockStatic(DrugDoseMaster.class);
             MockedStatic<ItemFormMaster> itemFormMaster = mockStatic(ItemFormMaster.class);
             MockedStatic<ChiefComplaintMaster> chiefComplaintMaster = mockStatic(ChiefComplaintMaster.class);
             MockedStatic<ProcedureData> procedureData = mockStatic(ProcedureData.class)) {
            ArrayList<ProcedureData> procedureDataList = new ArrayList<>();
            procedureData.when(() -> ProcedureData.getProcedures((ArrayList) any())).thenReturn(procedureDataList);
            ArrayList<ChiefComplaintMaster> chiefComplaintMasterList = new ArrayList<>();
            chiefComplaintMaster.when(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any())).thenReturn(chiefComplaintMasterList);
            ArrayList<ItemFormMaster> itemFormMasterList = new ArrayList<>();
            itemFormMaster.when(() -> ItemFormMaster.getItemFormList((ArrayList) any())).thenReturn(itemFormMasterList);
            ArrayList<DrugDoseMaster> drugDoseMasterList = new ArrayList<>();
            drugDoseMaster.when(() -> DrugDoseMaster.getDrugDoseMasters((ArrayList) any())).thenReturn(drugDoseMasterList);
            ArrayList<DrugDurationUnitMaster> drugDurationUnitMasterList = new ArrayList<>();
            drugDurationUnitMaster.when(() -> DrugDurationUnitMaster.getDrugDurationUnitMaster((ArrayList) any())).thenReturn(drugDurationUnitMasterList);
            ArrayList<DrugFrequencyMaster> drugFrequencyMasterList = new ArrayList<>();
            drugFrequencyMaster.when(() -> DrugFrequencyMaster.getDrugFrequencyMaster((ArrayList) any())).thenReturn(drugFrequencyMasterList);
            ArrayList<RouteOfAdmin> routeOfAdminList = new ArrayList<>();
            routeOfAdmin.when(() -> RouteOfAdmin.getRouteOfAdminList((ArrayList) any())).thenReturn(routeOfAdminList);
            ArrayList<NCDScreeningCondition> nCDScreeningConditionList = new ArrayList<>();
            nCDScreeningCondition.when(() -> NCDScreeningCondition.getNCDScreeningCondition((ArrayList) any())).thenReturn(nCDScreeningConditionList);
            ArrayList<NCDCareType> nCDCareTypeList = new ArrayList<>();
            nCDCareType.when(() -> NCDCareType.getNCDCareTypes((ArrayList) any())).thenReturn(nCDCareTypeList);
            target = new ANCMasterDataServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(procedureRepoMock).getProcedureMasterData(0, "gender1");
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
            ArrayList<Object[]> objectList3 = new ArrayList<>();
            doReturn(objectList3).when(itemFormMasterRepoMock).getItemFormMaster();
            ArrayList<Object[]> objectList4 = new ArrayList<>();
            doReturn(objectList4).when(drugDoseMasterRepoMock).getDrugDoseMaster();
            ArrayList<Object[]> objectList5 = new ArrayList<>();
            doReturn(objectList5).when(drugDurationUnitMasterRepoMock).getDrugDurationUnitMaster();
            ArrayList<Object[]> objectList6 = new ArrayList<>();
            doReturn(objectList6).when(drugFrequencyMasterRepoMock).getDrugFrequencyMaster();
            ArrayList<Object[]> objectList7 = new ArrayList<>();
            doReturn(objectList7).when(routeOfAdminRepoMock).getRouteOfAdminList();
            ArrayList<ItemMaster> itemMasterList = new ArrayList<>();
            doReturn(itemMasterList).when(itemMasterRepoMock).searchEdl(0);
            doReturn(0).when(masterVanRepoMock).getFacilityID(0);
            ArrayList<V_DrugPrescription> v_DrugPrescriptionList = new ArrayList<>();
            doReturn(v_DrugPrescriptionList).when(v_DrugPrescriptionRepoMock).getItemListForFacility(0);
            ArrayList arrayList = new ArrayList<>();
            doReturn(arrayList).when(ncdScreeningMasterServiceImplMock).getNCDScreeningConditions();
            ArrayList<Object[]> objectList8 = new ArrayList<>();
            doReturn(objectList8).when(ncdCareTypeRepoMock).getNCDCareTypes();
            //Act Statement(s)
            String result = target.getCommonDoctorMasterDataForGenopdAncNcdcarePnc(0, 0, "gender1", 0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                procedureData.verify(() -> ProcedureData.getProcedures((ArrayList) any()));
                chiefComplaintMaster.verify(() -> ChiefComplaintMaster.getChiefComplaintMasters((ArrayList) any()));
                itemFormMaster.verify(() -> ItemFormMaster.getItemFormList((ArrayList) any()));
                drugDoseMaster.verify(() -> DrugDoseMaster.getDrugDoseMasters((ArrayList) any()));
                drugDurationUnitMaster.verify(() -> DrugDurationUnitMaster.getDrugDurationUnitMaster((ArrayList) any()));
                drugFrequencyMaster.verify(() -> DrugFrequencyMaster.getDrugFrequencyMaster((ArrayList) any()));
                routeOfAdmin.verify(() -> RouteOfAdmin.getRouteOfAdminList((ArrayList) any()));
                nCDScreeningCondition.verify(() -> NCDScreeningCondition.getNCDScreeningCondition((ArrayList) any()));
                nCDCareType.verify(() -> NCDCareType.getNCDCareTypes((ArrayList) any()));
                verify(procedureRepoMock).getProcedureMasterData(0, "gender1");
                verify(chiefComplaintMasterRepoMock).getChiefComplaintMaster();
                verify(itemFormMasterRepoMock).getItemFormMaster();
                verify(drugDoseMasterRepoMock).getDrugDoseMaster();
                verify(drugDurationUnitMasterRepoMock).getDrugDurationUnitMaster();
                verify(drugFrequencyMasterRepoMock).getDrugFrequencyMaster();
                verify(routeOfAdminRepoMock).getRouteOfAdminList();
                verify(itemMasterRepoMock).searchEdl(0);
                verify(masterVanRepoMock).getFacilityID(0);
                verify(v_DrugPrescriptionRepoMock).getItemListForFacility(0);
                verify(ncdScreeningMasterServiceImplMock).getNCDScreeningConditions();
                verify(ncdCareTypeRepoMock).getNCDCareTypes();
            });
        }
    }
}
