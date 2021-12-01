package org.moDgo.controller.member;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class JoiningClubPageResponse {
    private Long totalCount;
    private List<JoiningClubResponse> joiningClubList;

    public JoiningClubPageResponse(Long totalCount, List<JoiningClubResponse> joiningClubList) {
        this.totalCount = totalCount;
        this.joiningClubList = joiningClubList;
    }
}
