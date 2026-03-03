package com.klef.sdp.backendproject.service;

import com.klef.sdp.backendproject.dto.*;
import com.klef.sdp.backendproject.model.Donations;

import java.util.List;

public interface DonorService {
    DonationResponseDTO createDonation(DonationRequestDTO request);
    DonationResponseDTO updateDonation(Donations donation);
    String deleteDonation(String donationId, String userId);
    List<DonationResponseDTO> listDonations(String userId, String status);
    DonationResponseDTO getDonationDetails(String donationId, String userId);
    List<MatchedBeneficiaryDTO> matchDonation(String donationId, String userId);
    DonationResponseDTO updateDonationStatus(String donationId, String userId, String status);
}
