package sut.sa.g16.Entity;
import  javax.persistence.*;
import lombok.*;

@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table (name = "Member")
public class Member {
    @Id
    @SequenceGenerator(name="member_seq",sequenceName="mermber_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_seq")
    @Column(name="Member_ID",unique = true, nullable = false)
    private @NonNull Long memberId;
    private @NonNull String name;
    private @NonNull String email;
    private @NonNull String phonenumber;
    private @NonNull String  username;
    private @NonNull String password;


    public Long getMemberId(){ return memberId; }
    public  void setMemberId(Long memberId) { this.memberId = memberId; }
    public String getName(){ return name; }
    public  void setName(String name) { this.name = name; }
    public String getEmailMember(){ return email; }
    public  void setEmailMember(String email) { this.email = email; }
    public String getPhoneMember(){ return phonenumber; }
    public  void setPhoneMember(String phonenumber) { this.phonenumber = phonenumber; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}