package com.iemr.tm.service.videoconsultation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.data.videoconsultation.UserJitsi;
import com.iemr.tm.data.videoconsultation.UserVideoConsultation;
import com.iemr.tm.repo.login.MasterVanRepo;
import com.iemr.tm.repo.videoconsultation.UserJitsiRepo;
import com.iemr.tm.repo.videoconsultation.VideoConsultationUserRepo;
import com.iemr.tm.utils.exception.VideoConsultationException;

@ExtendWith(MockitoExtension.class)
class VideoConsultationServiceImplTest {

	@Mock
	private VideoConsultationUserRepo mockUserRepo;
	@Mock
	private UserJitsiRepo mockUserJitsiRepo;
	@Mock
	private MasterVanRepo mockMasterVanRepo;

	@InjectMocks
	private VideoConsultationServiceImpl videoConsultationServiceImplUnderTest;

	@Test
	void testLogin() throws Exception {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(new UserVideoConsultation());

		// Run the test
		final String result = videoConsultationServiceImplUnderTest.login(0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testLogin_VideoConsultationUserRepoReturnsNull() {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.login(0L))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testCallUser() throws Exception {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(new UserVideoConsultation());

		// Run the test
		final String result = videoConsultationServiceImplUnderTest.callUser(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testCallUser_VideoConsultationUserRepoReturnsNull() {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.callUser(0L, 0L))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testCallUserjitsi() throws Exception {
		// Setup
		// Configure UserJitsiRepo.findOneJitsiMap(...).
		final UserJitsi userJitsi = new UserJitsi("jitsiUserName", "jitsiPassword");

		userJitsi.toString();

		when(mockUserJitsiRepo.findOneJitsiMap(0L)).thenReturn(userJitsi);

		// Run the test
		final String result = videoConsultationServiceImplUnderTest.callUserjitsi(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testCallUserjitsi_UserJitsiRepoReturnsNull() {
		// Setup
		when(mockUserJitsiRepo.findOneJitsiMap(0L)).thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.callUserjitsi(0L, 0L))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testCallVan() throws Exception {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(new UserVideoConsultation());
		when(mockMasterVanRepo.getSpokeEmail(0)).thenReturn("result");

		// Run the test
		final String result = videoConsultationServiceImplUnderTest.callVan(0L, 0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testCallVan_VideoConsultationUserRepoReturnsNull() {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(null);
		when(mockMasterVanRepo.getSpokeEmail(0)).thenReturn("result");

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.callVan(0L, 0))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testCallVan_MasterVanRepoReturnsNull() {
		// Setup
		when(mockUserRepo.findOneMap(0L)).thenReturn(new UserVideoConsultation());
		when(mockMasterVanRepo.getSpokeEmail(0)).thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.callVan(0L, 0))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testCallVanJitsi() throws Exception {
		// Setup
		// Configure UserJitsiRepo.findOneJitsiMap(...).
		final UserJitsi userJitsi = new UserJitsi("jitsiUserName", "jitsiPassword");
		when(mockUserJitsiRepo.findOneJitsiMap(0L)).thenReturn(userJitsi);

		// Configure UserJitsiRepo.findOneJitsiMapVan(...).
		final UserJitsi userJitsi1 = new UserJitsi("jitsiUserName", "jitsiPassword");
		when(mockUserJitsiRepo.findOneJitsiMapVan(0)).thenReturn(userJitsi1);

		// Run the test
		final String result = videoConsultationServiceImplUnderTest.callVanJitsi(0L, 0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testCallVanJitsi_UserJitsiRepoFindOneJitsiMapReturnsNull() {
		// Setup
		when(mockUserJitsiRepo.findOneJitsiMap(0L)).thenReturn(null);

		// Configure UserJitsiRepo.findOneJitsiMapVan(...).
		final UserJitsi userJitsi = new UserJitsi("jitsiUserName", "jitsiPassword");
		when(mockUserJitsiRepo.findOneJitsiMapVan(0)).thenReturn(userJitsi);

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.callVanJitsi(0L, 0))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testCallVanJitsi_UserJitsiRepoFindOneJitsiMapVanReturnsNull() {
		// Setup
		// Configure UserJitsiRepo.findOneJitsiMap(...).
		final UserJitsi userJitsi = new UserJitsi("jitsiUserName", "jitsiPassword");

		userJitsi.toString();

		when(mockUserJitsiRepo.findOneJitsiMap(0L)).thenReturn(userJitsi);

		when(mockUserJitsiRepo.findOneJitsiMapVan(0)).thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> videoConsultationServiceImplUnderTest.callVanJitsi(0L, 0))
				.isInstanceOf(VideoConsultationException.class);
	}

	@Test
	void testLogout() {
		assertThat(videoConsultationServiceImplUnderTest.logout()).isEqualTo("swymed://psmri.swymed.com?logout");
	}
}
