package team.themoment.datagsm.sdk.openapi.model;

import java.util.Optional;

/**
 * 동아리 부원 정보
 */
public class ParticipantInfo {
    private Long id;
    private String name;
    private String email;
    private Integer studentNumber;
    private Major major;
    private Sex sex;

    public ParticipantInfo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Optional<Integer> getStudentNumber() {
        return Optional.ofNullable(studentNumber);
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Optional<Major> getMajor() {
        return Optional.ofNullable(major);
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ParticipantInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentNumber=" + studentNumber +
                ", major=" + major +
                ", sex=" + sex +
                '}';
    }
}