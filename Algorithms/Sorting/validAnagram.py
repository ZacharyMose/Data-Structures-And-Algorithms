def is_anagram_sorting(s,t):
    if len(s) != len(t):
        return False
    sorted_s = "".join(sorted(s))
    sorted_t = "".join(sorted(t))
    return sorted_s == sorted_t