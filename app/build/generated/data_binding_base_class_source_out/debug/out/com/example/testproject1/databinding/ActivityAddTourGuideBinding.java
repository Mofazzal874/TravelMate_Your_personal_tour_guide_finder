// Generated by view binder compiler. Do not edit!
package com.example.testproject1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.testproject1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddTourGuideBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView NID;

  @NonNull
  public final EditText NIDValue;

  @NonNull
  public final TextView address;

  @NonNull
  public final EditText addressValue;

  @NonNull
  public final TextView age;

  @NonNull
  public final EditText ageValue;

  @NonNull
  public final TextView area;

  @NonNull
  public final Spinner areaList;

  @NonNull
  public final TextView bloodGroup;

  @NonNull
  public final EditText bloodGroupValue;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final TextView division;

  @NonNull
  public final Spinner divisionList;

  @NonNull
  public final TextView education;

  @NonNull
  public final EditText educationValue;

  @NonNull
  public final TextView email;

  @NonNull
  public final EditText emailValue;

  @NonNull
  public final TextView experience;

  @NonNull
  public final EditText experienceValue;

  @NonNull
  public final TextView fullname;

  @NonNull
  public final EditText fullnameValue;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView languageSkill;

  @NonNull
  public final EditText languageSkillValue;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView paymentNumber;

  @NonNull
  public final EditText paymentNumberValue;

  @NonNull
  public final TextView phone;

  @NonNull
  public final EditText phoneValue;

  @NonNull
  public final TextView profileEmail;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final TextView profileName;

  @NonNull
  public final Button register;

  @NonNull
  public final TextView socialLink;

  @NonNull
  public final EditText socialLinkValue;

  private ActivityAddTourGuideBinding(@NonNull ConstraintLayout rootView, @NonNull TextView NID,
      @NonNull EditText NIDValue, @NonNull TextView address, @NonNull EditText addressValue,
      @NonNull TextView age, @NonNull EditText ageValue, @NonNull TextView area,
      @NonNull Spinner areaList, @NonNull TextView bloodGroup, @NonNull EditText bloodGroupValue,
      @NonNull ConstraintLayout constraintLayout3, @NonNull TextView division,
      @NonNull Spinner divisionList, @NonNull TextView education, @NonNull EditText educationValue,
      @NonNull TextView email, @NonNull EditText emailValue, @NonNull TextView experience,
      @NonNull EditText experienceValue, @NonNull TextView fullname,
      @NonNull EditText fullnameValue, @NonNull ImageView imageView2,
      @NonNull TextView languageSkill, @NonNull EditText languageSkillValue,
      @NonNull LinearLayout linearLayout, @NonNull TextView paymentNumber,
      @NonNull EditText paymentNumberValue, @NonNull TextView phone, @NonNull EditText phoneValue,
      @NonNull TextView profileEmail, @NonNull ImageView profileImage,
      @NonNull TextView profileName, @NonNull Button register, @NonNull TextView socialLink,
      @NonNull EditText socialLinkValue) {
    this.rootView = rootView;
    this.NID = NID;
    this.NIDValue = NIDValue;
    this.address = address;
    this.addressValue = addressValue;
    this.age = age;
    this.ageValue = ageValue;
    this.area = area;
    this.areaList = areaList;
    this.bloodGroup = bloodGroup;
    this.bloodGroupValue = bloodGroupValue;
    this.constraintLayout3 = constraintLayout3;
    this.division = division;
    this.divisionList = divisionList;
    this.education = education;
    this.educationValue = educationValue;
    this.email = email;
    this.emailValue = emailValue;
    this.experience = experience;
    this.experienceValue = experienceValue;
    this.fullname = fullname;
    this.fullnameValue = fullnameValue;
    this.imageView2 = imageView2;
    this.languageSkill = languageSkill;
    this.languageSkillValue = languageSkillValue;
    this.linearLayout = linearLayout;
    this.paymentNumber = paymentNumber;
    this.paymentNumberValue = paymentNumberValue;
    this.phone = phone;
    this.phoneValue = phoneValue;
    this.profileEmail = profileEmail;
    this.profileImage = profileImage;
    this.profileName = profileName;
    this.register = register;
    this.socialLink = socialLink;
    this.socialLinkValue = socialLinkValue;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddTourGuideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddTourGuideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_tour_guide, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddTourGuideBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.NID;
      TextView NID = ViewBindings.findChildViewById(rootView, id);
      if (NID == null) {
        break missingId;
      }

      id = R.id.NID_value;
      EditText NIDValue = ViewBindings.findChildViewById(rootView, id);
      if (NIDValue == null) {
        break missingId;
      }

      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.address_value;
      EditText addressValue = ViewBindings.findChildViewById(rootView, id);
      if (addressValue == null) {
        break missingId;
      }

      id = R.id.age;
      TextView age = ViewBindings.findChildViewById(rootView, id);
      if (age == null) {
        break missingId;
      }

      id = R.id.age_value;
      EditText ageValue = ViewBindings.findChildViewById(rootView, id);
      if (ageValue == null) {
        break missingId;
      }

      id = R.id.area;
      TextView area = ViewBindings.findChildViewById(rootView, id);
      if (area == null) {
        break missingId;
      }

      id = R.id.area_list;
      Spinner areaList = ViewBindings.findChildViewById(rootView, id);
      if (areaList == null) {
        break missingId;
      }

      id = R.id.blood_group;
      TextView bloodGroup = ViewBindings.findChildViewById(rootView, id);
      if (bloodGroup == null) {
        break missingId;
      }

      id = R.id.blood_group_value;
      EditText bloodGroupValue = ViewBindings.findChildViewById(rootView, id);
      if (bloodGroupValue == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.division;
      TextView division = ViewBindings.findChildViewById(rootView, id);
      if (division == null) {
        break missingId;
      }

      id = R.id.division_list;
      Spinner divisionList = ViewBindings.findChildViewById(rootView, id);
      if (divisionList == null) {
        break missingId;
      }

      id = R.id.education;
      TextView education = ViewBindings.findChildViewById(rootView, id);
      if (education == null) {
        break missingId;
      }

      id = R.id.education_value;
      EditText educationValue = ViewBindings.findChildViewById(rootView, id);
      if (educationValue == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.email_value;
      EditText emailValue = ViewBindings.findChildViewById(rootView, id);
      if (emailValue == null) {
        break missingId;
      }

      id = R.id.experience;
      TextView experience = ViewBindings.findChildViewById(rootView, id);
      if (experience == null) {
        break missingId;
      }

      id = R.id.experience_value;
      EditText experienceValue = ViewBindings.findChildViewById(rootView, id);
      if (experienceValue == null) {
        break missingId;
      }

      id = R.id.fullname;
      TextView fullname = ViewBindings.findChildViewById(rootView, id);
      if (fullname == null) {
        break missingId;
      }

      id = R.id.fullname_value;
      EditText fullnameValue = ViewBindings.findChildViewById(rootView, id);
      if (fullnameValue == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.language_skill;
      TextView languageSkill = ViewBindings.findChildViewById(rootView, id);
      if (languageSkill == null) {
        break missingId;
      }

      id = R.id.language_skill_value;
      EditText languageSkillValue = ViewBindings.findChildViewById(rootView, id);
      if (languageSkillValue == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.payment_number;
      TextView paymentNumber = ViewBindings.findChildViewById(rootView, id);
      if (paymentNumber == null) {
        break missingId;
      }

      id = R.id.payment_number_value;
      EditText paymentNumberValue = ViewBindings.findChildViewById(rootView, id);
      if (paymentNumberValue == null) {
        break missingId;
      }

      id = R.id.phone;
      TextView phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.phone_value;
      EditText phoneValue = ViewBindings.findChildViewById(rootView, id);
      if (phoneValue == null) {
        break missingId;
      }

      id = R.id.profile_email;
      TextView profileEmail = ViewBindings.findChildViewById(rootView, id);
      if (profileEmail == null) {
        break missingId;
      }

      id = R.id.profile_image;
      ImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.profile_name;
      TextView profileName = ViewBindings.findChildViewById(rootView, id);
      if (profileName == null) {
        break missingId;
      }

      id = R.id.register;
      Button register = ViewBindings.findChildViewById(rootView, id);
      if (register == null) {
        break missingId;
      }

      id = R.id.social_link;
      TextView socialLink = ViewBindings.findChildViewById(rootView, id);
      if (socialLink == null) {
        break missingId;
      }

      id = R.id.social_link_value;
      EditText socialLinkValue = ViewBindings.findChildViewById(rootView, id);
      if (socialLinkValue == null) {
        break missingId;
      }

      return new ActivityAddTourGuideBinding((ConstraintLayout) rootView, NID, NIDValue, address,
          addressValue, age, ageValue, area, areaList, bloodGroup, bloodGroupValue,
          constraintLayout3, division, divisionList, education, educationValue, email, emailValue,
          experience, experienceValue, fullname, fullnameValue, imageView2, languageSkill,
          languageSkillValue, linearLayout, paymentNumber, paymentNumberValue, phone, phoneValue,
          profileEmail, profileImage, profileName, register, socialLink, socialLinkValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
